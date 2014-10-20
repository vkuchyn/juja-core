package ua.com.juja.study.core.presentation.gc;

import java.lang.ref.WeakReference;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 9:02 PM
 */
public class WeakReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakReference[] references = new WeakReference[1000];
        int counter = 0;
        while (counter < 1000) {
            System.out.println();
            for (int i = 0; i < counter; i++) {
                System.out.print(references[i].get() == null ? "*" : "E");
            }
            references[counter++] = new WeakReference<>(new byte[10_000_000]);
            Thread.sleep(100);
        }
    }
}
