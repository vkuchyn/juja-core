package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 2:01 PM
 */
public class VolatileDemo {
    private static int field = 1;

    public static void main(String[] args) {
        Thread th1 = new Thread(){
            @Override
            public void run() {
                System.out.println("field " + field);
            }
        };

        Thread th2 = new Thread(){
            @Override
            public void run() {
                System.out.println("field " + field);
            }
        };

        th1.start();
        field = 2;
        th2.start();

        System.out.println(field);
    }
}
