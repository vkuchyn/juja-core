package ua.com.juja.study.core.presentation.multithreading.util.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/26/14
 * Time: 9:32 AM
 */
public class LockDemo {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                lockedMethod1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lockedMethod2();
            }
        }).start();
    }

    public static void lockedMethod1() {
        lock.lock();
        try {
            System.out.println("Entered locked method 1");
            Thread.sleep(1000);
            System.out.println("Exit locked method 1");
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            lock.unlock();
        }

    }

    public static void lockedMethod2() {
        lock.lock();
        try {
            System.out.println("Entered locked method 2");
            Thread.sleep(1000);
            System.out.println("Exit locked method 2");
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            lock.unlock();
        }

    }

}
