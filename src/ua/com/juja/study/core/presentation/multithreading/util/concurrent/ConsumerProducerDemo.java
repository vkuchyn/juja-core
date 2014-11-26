package ua.com.juja.study.core.presentation.multithreading.util.concurrent;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/26/14
 * Time: 10:55 AM
 */
public class ConsumerProducerDemo {
    private BlockingQueue<Integer> numbersQueue = new ArrayBlockingQueue<>(3);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConsumerProducerDemo demo = new ConsumerProducerDemo();
        demo.startDemo();
    }

    public void startDemo() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        final FactorialCounterConsumer consumer = new FactorialCounterConsumer();
        final FactorialCounterProducer producer = new FactorialCounterProducer();

//        Future task1 = executorService.submit(new Callable<Object>() {
//            @Override
//            public Object call() throws Exception {
//                int counter = 10;
//                while (counter-- > 0) {
//                    producer.produce();
//                }
//                return null;
//            }
//        });
        Future task2 = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                int counter = 10;
                while (counter-- > 0){
                    consumer.compute();
                }
                return null;
            }
        });
//        task1.get();
        task2.get();
        executorService.shutdown();
    }

    private class FactorialCounterConsumer {
        public void compute() throws InterruptedException {
            Integer numberToComputeFactorial = numbersQueue.take();
            System.out.println("Computing factorial of " + numberToComputeFactorial);
            Thread.sleep(1000);
        }
    }

    private class FactorialCounterProducer {
        public void produce() throws InterruptedException {
            int producedNumber = (int) (Math.random() * 1000);
            numbersQueue.put(producedNumber);
            System.out.println("produced " + producedNumber);
            Thread.sleep(500);
        }
    }

}
