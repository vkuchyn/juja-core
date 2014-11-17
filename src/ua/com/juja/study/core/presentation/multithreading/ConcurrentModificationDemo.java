package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 10:27 AM
 */
public class ConcurrentModificationDemo extends Thread {
    private static String text = "";
    private static String text1 = "";

    public static void main(String[] args) throws InterruptedException {
        ConcurrentModificationDemo th1 = new ConcurrentModificationDemo("1");
        th1.start();
        ConcurrentModificationDemo th2 = new ConcurrentModificationDemo("2");
        th2.start();
        Thread.sleep(2);
        System.out.println(text);
//        System.out.println(text1);
    }

    public ConcurrentModificationDemo(String name) {
        super(name);
    }

    @Override
    public synchronized void run() {
        text = text + getName();
    }
}
