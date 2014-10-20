package ua.com.juja.study.core.presentation.gc;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 9:05 PM
 */
public class FinalizeDemo {
    public static void main(String[] args) {
        new Object() {
            protected void finalize() throws Throwable {
                System.out.println("finalize()");
            }
        };
        while (true) ;
    }
}
