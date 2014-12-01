package ua.com.juja.study.core.presentation.jdbc;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 12/1/14
 * Time: 12:38 PM
 */
public class JdbcDemo {
    private static Connection connection;
    public static User extractUser(String email) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("select p.email, p.name, ph.phone from participations p join " +
                "\"Phones\" ph on p.email=ph.email where p.email=?");
        preparedStatement.setString(1, email);
        ResultSet userRs = preparedStatement.executeQuery();
        User user = new User();
        List<String> phones = new LinkedList<>();
        while (userRs.next()) {
            user.setEmail(userRs.getString("email"));
            user.setName(userRs.getString("name"));
            phones.add(userRs.getString("phone"));
        }
        user.setPhoneNumbers(phones);
        userRs.close();
        return user;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection connection = null;
        try {
            connection = establishConnection();
            JdbcDemo.connection = connection;
            System.out.println(extractUser("kuchin.victor@gmail.com"));
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.executeUpdate("insert into participations values ('kuchin1.victor@gmail.com', 'Viktor Kuchyn')");
            connection.rollback();
            ResultSet participations = statement.executeQuery("select * from participations");
            while (participations.next()) {
                System.out.print(participations.getString(1) + " | ");
                System.out.println(participations.getString("name"));
            }
//            statement.close();
            participations.close();

            String email = "kuchin1.victor@gmail.com";
            PreparedStatement preparedStatement = connection.prepareStatement("select * from participations where " +
                    "email=?");
            preparedStatement.setString(1, email);
            participations = preparedStatement.executeQuery();
            while (participations.next()) {
                System.out.print(participations.getString(1) + " | ");
                System.out.println(participations.getString("name"));
            }
            preparedStatement.close();
            participations.close();

            CallableStatement callableStatement = connection.prepareCall("{call increment(?)}");
            callableStatement.setInt(1, 255);
            ResultSet increment = callableStatement.executeQuery();
            while (increment.next()) {
                System.out.print(increment.getString(1));
            }
            callableStatement.close();
            increment.close();
        } finally {
            closeConnection(connection);
        }
    }

    private static Connection establishConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/juja", "juja_core", "juja");
    }

    private static void closeConnection(Connection connection) throws SQLException {
        if (connection != null)
            connection.close();
    }

}
