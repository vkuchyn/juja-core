package ua.com.juja.study.core.presentation.oop;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/9/14
 * Time: 9:06 PM
 */
public class PolymorphizmDemo {
    public static void main(String[] args) {
        JdbcExecutor jdbcExecutor = new MockJdbcExecutor();
        jdbcExecutor.executeScript("select * from void");
    }
}
