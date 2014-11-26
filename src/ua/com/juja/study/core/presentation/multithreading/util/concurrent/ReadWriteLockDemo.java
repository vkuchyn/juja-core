package ua.com.juja.study.core.presentation.multithreading.util.concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/26/14
 * Time: 10:16 AM
 */
public class ReadWriteLockDemo {
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public static void main(String[] args) {
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        class ReaderThread implements Runnable {
            @Override
            public void run() {
                int count = 3;
                while (count-- > 0) {
                    System.out.println(demo.read());
                }
            }
        }

        executorService.execute(new ReaderThread());
        executorService.execute(new ReaderThread());
        pause(1000);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                demo.write("Writing to resource ");
            }
        });
        executorService.shutdown();
    }

    private void write(String text) {
        try {
            readWriteLock.writeLock().lock();
            System.out.println(Thread.currentThread().getName() + " " + text);
            pause(5000);
            System.out.println(Thread.currentThread().getName() + " Finished writing");
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public String read() {
        try {
            readWriteLock.readLock().lock();
            pause(1000);
            return Thread.currentThread().getName();
        } finally {
            readWriteLock.readLock().unlock();
        }
    }


    private static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
