package ua.com.juja.study.core.presentation.exception;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/4/14
 * Time: 12:20 PM
 */
public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        tryCatchFinallyOrder();
        tryCatchFinallyPolymorph();
        tryWithResourcesDemo();
    }

    private static void tryWithResourcesDemo() {
        try (CloseableDemo closeable = new CloseableDemo()) {
            // do nothing
            throw new RuntimeException();
        }
    }

    private static void tryCatchFinallyPolymorph() {
        try {
            int random = (int) (Math.random() * 100);
            if (random >= 50) {
                throw new IllegalArgumentException();
            } else {
                throw new IOException();
            }
        } catch (IOException | IllegalArgumentException ex) {
            System.out.println("exception " + ex);
        }
    }

    private static int tryCatchFinallyOrder() {
        try {
            throw new IOException();
        } catch (IOException ex) {
            return 1;
        } finally {
            return 2;
        }
    }
}

class CloseableDemo implements Closeable {

    @Override
    public void close() {
        System.out.println("I am closing ");
    }
}
