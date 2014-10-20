package ua.com.juja.study.core.presentation.gc;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 6:44 PM
 */
public class GarbageDemo {
    public static void main(String[] args) {
        for (int k = 0; k < 256; k++) {
            System.out.println(k);
            Object ref = new byte[1_000_000];
        }
    }
}