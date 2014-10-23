package ua.com.juja.study.core.presentation.autoboxing;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 4:50 PM
 */
public class ArraysDemo {
    public static void main(String[] args) {
//        simpleArraysToStringEqualsDemo();
//        doubleArraysToStringEqualsDemo();
//        deepToStringEqualsDemo();
//        arraysCloneDemo();
//        arraysCloneProblemDemo();
//        arraysCopyDemo();
        Double [] ints = {5.0,4.0,3.0,2.0,1.0};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void arraysCopyDemo() {
        System.out.println("arraysCopyDemo");
        int[] array0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = new int[array0.length];
        System.out.println("array0 = " + Arrays.toString(array0));
        System.out.println("array1 = " + Arrays.toString(array1));

        System.out.println();

        System.arraycopy(array0, 2, array1, 4, 6);
        System.out.println("array0 = " + Arrays.toString(array0));
        System.out.println("array1 = " + Arrays.toString(array1));

        int[] original = {0, 1, 2, 3, 4};
        int[] shortCopy = Arrays.copyOf(original, 3);
        int[] longCopy = Arrays.copyOf(original, 7);

        System.out.println("original  = " + Arrays.toString(original));
        System.out.println("shortCopy = " + Arrays.toString(shortCopy));
        System.out.println("longCopy  = " + Arrays.toString(longCopy));
    }

    private static void arraysCloneProblemDemo() {
        System.out.println("arraysCloneProblemDemo");
        int[][] array0 = {{0, 1}, {2, 3}};
        int[][] array1 = new int[array0.length][array0[0].length];
        System.arraycopy(array0, 0, array1, 0, array0.length);

        array0[1][1] = 9;

        System.out.println("array0 = " + Arrays.deepToString(array0));
        System.out.println("array1 = " + Arrays.deepToString(array1));
    }

    private static void arraysCloneDemo() {
        System.out.println("arraysCloneDemo");
        int[] array0 = {0, 1, 2};
        int[] array1 = array0.clone();

        System.out.println("array0 = " + Arrays.toString(array0));
        System.out.println("array1 = " + Arrays.toString(array1));
    }

    private static void deepToStringEqualsDemo() {
        System.out.println("deepToStringEqualsDemo");
        int[][] array0 = {{0, 1}, {2, 3}};
        int[][] array1 = {{0, 1}, {2, 3}};

        System.out.println(Arrays.deepToString(array0));
        System.out.println(Arrays.deepEquals(array0, array1));
    }

    private static void doubleArraysToStringEqualsDemo() {
        System.out.println("doubleArraysToStringEqualsDemo");
        int[][] array0 = {{0, 1}, {2, 3, 4}};
        int[][] array1 = {{0, 1}, {2, 3}};

        System.out.println(Arrays.toString(array0));
        System.out.println(Arrays.equals(array0, array1));
    }

    private static void simpleArraysToStringEqualsDemo() {
        System.out.println("simpleArraysToStringEqualsDemo");
        int[] array0 = {0, 1, 2};
        int[] array1 = {0, 1, 2};

        System.out.println(array0);
        System.out.println(array0.equals(array1));
        System.out.println(Arrays.toString(array0));
        System.out.println(Arrays.equals(array0, array1));
    }
}
