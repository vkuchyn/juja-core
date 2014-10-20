package ua.com.juja.study.core.presentation.gc;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 6:48 PM
 */
public class GarbageStressDemo {
    public static void main(String[] args) {
        Object ref = null;
        for (int k = 0; k < 1000; k++) {
            System.out.println(k);
            ref = new Object[]{ref, new byte[1_000_000]};
        }
    }
}
