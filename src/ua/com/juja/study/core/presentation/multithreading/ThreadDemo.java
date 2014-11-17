package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 10:07 AM
 */
public class ThreadDemo {
    public static void main(String[] args) {
        runThreadMethod1();
        runThreadMethod2();
    }

    private static void runThreadMethod2() {
        Thread th = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread with thread inheritance started");
            }
        };
        th.start();
    }

    private static void runThreadMethod1() {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with Runnable started");
            }
        });
        th.start();
    }

}
