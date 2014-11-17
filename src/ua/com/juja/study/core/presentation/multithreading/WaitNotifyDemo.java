package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 11:55 AM
 */
public class WaitNotifyDemo {

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyDemo demo = new WaitNotifyDemo();
        new Thread(new WaitRunnable(demo), "th1").start();
        Thread.sleep(1100);
        new Thread(new NotifyRunnable(demo), "th2").start();
    }

    public synchronized void waitExample() throws InterruptedException {
        System.out.println("Thread " + Thread.currentThread().getName() + " get object monitor and going to sleep");
        Thread.sleep(1000);
        System.out.println("Thread " + Thread.currentThread().getName() + " get object monitor and going to wait");
        wait();
        System.out.println("Thread " + Thread.currentThread().getName() + " woke up");
    }

    public void notifyExample() {
        System.out.println("Thread " + Thread.currentThread().getName() + " notifying objects");
        notify();
    }

    static class WaitRunnable implements Runnable {

        private WaitNotifyDemo demo;

        WaitRunnable(WaitNotifyDemo demo) {

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

        private WaitNotifyDemo demo;

        NotifyRunnable(WaitNotifyDemo demo) {
            this.demo = demo;
        }

        @Override
        public void run() {
            synchronized (demo) {
                demo.notifyExample();
            }
        }
    }
}


