package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 3:04 PM
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){

    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
