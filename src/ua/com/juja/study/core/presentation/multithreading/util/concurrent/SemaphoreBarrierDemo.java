package ua.com.juja.study.core.presentation.multithreading.util.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/26/14
 * Time: 11:44 AM
 */
public class SemaphoreBarrierDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SemaphoreBarrierDemo demo = new SemaphoreBarrierDemo();
//        demo.startSemaphoreDemo();
        demo.startBarrierDemo();
    }

    private void startBarrierDemo() throws ExecutionException, InterruptedException {
        final CountDownLatch barrier = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        class BarrierTask implements Callable{

            @Override
            public Object call() throws Exception {
                System.out.println("Before barrier " + Thread.currentThread().getName());
                barrier.await();
                System.out.println("Started " + Thread.currentThread().getName());
                return null;
            }
        }

        Future task1 = executorService.submit(new BarrierTask());
        barrier.countDown();
        Future task2 = executorService.submit(new BarrierTask());
        barrier.countDown();
        Future task3 = executorService.submit(new BarrierTask());
        Thread.sleep(1000);
        barrier.countDown();
        task1.get();
        task2.get();
        task3.get();
        executorService.shutdown();
    }

    private void startSemaphoreDemo() throws ExecutionException, InterruptedException {
        final Semaphore semaphore = new Semaphore(2);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        class SemaphoreTask implements Callable{

            @Override
            public Object call() throws Exception {
                semaphore.acquire();
                System.out.println("Enter semaphore " + Thread.currentThread().getName());
                Thread.sleep(1000);
                semaphore.release();
                return null;
            }
        }
        Future task1 = executorService.submit(new SemaphoreTask());
        Future task2 = executorService.submit(new SemaphoreTask());
        Future task3 = executorService.submit(new SemaphoreTask());
        task1.get();
        task2.get();
        task3.get();
        executorService.shutdown();
    }
}
