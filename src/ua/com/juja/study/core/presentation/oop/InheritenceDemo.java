package ua.com.juja.study.core.presentation.oop;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/9/14
 * Time: 9:01 PM
 */
public class InheritenceDemo {

    public static void main(String[] args) {
        JdbcExecutor jdbcExecutor = new JdbcExecutor();
        jdbcExecutor.executeScript("select * from nothing");

        MockJdbcExecutor mockJdbcExecutor = new MockJdbcExecutor();
        mockJdbcExecutor.executeScript("select * from nothing");
    }
}

class JdbcExecutor {
    public void executeScript(String sql) {
        System.out.println("Pretend I am executing SQL ....." + sql);
    }
}

class MockJdbcExecutor extends JdbcExecutor{

}
