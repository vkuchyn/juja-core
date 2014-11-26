package ua.com.juja.study.core.presentation.multithreading.util.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/26/14
 * Time: 10:01 AM
 */
public class ConditionDemo {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        ConditionDemo demo = new ConditionDemo();
        new Thread(new WaitRunnable(demo), "th1").start();
        Thread.sleep(2100);
        new Thread(new NotifyRunnable(demo), "th2").start();
    }

    public void waitExample() throws InterruptedException {
        lock.lock();
        System.out.println("Thread " + Thread.currentThread().getName() + " get object monitor and going to sleep");
        Thread.sleep(1000);
        System.out.println("Thread " + Thread.currentThread().getName() + " get object monitor and going to wait");
        condition.await();
        System.out.println("Thread " + Thread.currentThread().getName() + " woke up");
        lock.unlock();
    }

    public void notifyExample() {
        System.out.println("Thread " + Thread.currentThread().getName() + " notifying objects");
        lock.lock();
        condition.signal();
        lock.unlock();
    }

    static class WaitRunnable implements Runnable {

        private ConditionDemo demo;

        WaitRunnable(ConditionDemo demo) {

            this.demo = demo;
        }

        @Override
        public void run() {
            try {
                demo.waitExample();
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    static class NotifyRunnable implements Runnable {

        private ConditionDemo demo;

        NotifyRunnable(ConditionDemo demo) {
            this.demo = demo;
        }

        @Override
        public void run() {
            demo.notifyExample();
        }
    }

}
