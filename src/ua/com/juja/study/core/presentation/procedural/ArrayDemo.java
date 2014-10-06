package ua.com.juja.study.core.presentation.procedural;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 7:24 PM
 */
public class ArrayDemo {

    private static char b;

    public static void main(String[] args) {
        initArray();
    }

    private static void initArray() {
        int[] array = new int[10];
        System.out.println((int)b);
        printArray(array);
        int array1[] = new int[10];
        printArray(array1);
        int array2[];
        array2 = new int[]{1, 2, 3};
        printArray(array2);
        int[] array3 = {1, 2, 3, 4};
        printArray(array3);
        int array4[];
        array4 = new int[]{1, 2, 3, 4};
        printArray(array4);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
