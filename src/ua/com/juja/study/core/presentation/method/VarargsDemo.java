package ua.com.juja.study.core.presentation.method;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 10:47 PM
 */
public class VarargsDemo {
    public static void main(String[] args) {
        printStringArray(null, args);
        System.out.println();
        printStringArray(null, new String[]{"1", "2", "3"});
    }

    public static void printStringArray(int[] numbers, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

}
