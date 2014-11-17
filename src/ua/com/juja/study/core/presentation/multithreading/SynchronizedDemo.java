package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 10:56 AM
 */
public class SynchronizedDemo implements Runnable{

    public static void main(String[] args) {
        final SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                doSomething();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                doSomethingSynchronized();
            }
        }).start();
    }

    public synchronized static void doSomethingSynchronized() {
        System.out.println("Entered static block");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Exit static block");
    }

    public static synchronized void doSomething() {
        System.out.println("Entered non static block");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Exit non static block");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
