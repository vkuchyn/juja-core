package ua.com.juja.study.core.presentation.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/17/14
 * Time: 10:15 AM
 */
public class SingletonLazyConcurrent {
    private static SingletonLazyConcurrent instance;

    private SingletonLazyConcurrent() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static SingletonLazyConcurrent getInstance() {
        if (instance == null) {
//            System.out.println("Singleton instance created " + new SingletonLazyConcurrent());
            instance = new SingletonLazyConcurrent();
        }

        return instance;
    }

    public static void main(String[] args) {
        class GetSingleton implements Runnable {
            @Override
            public void run() {
                System.out.println(getInstance());
            }
        }

        new Thread(new GetSingleton()).start();
        new Thread(new GetSingleton()).start();
    }

}
