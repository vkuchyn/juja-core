package ua.com.juja.study.core.presentation.recursion;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 5:00 PM
 */
public class MergeSorter {

    public static boolean debugMode = true;

    public static void main(String[] args) {
        int[] emptyArray = {};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        int[] backSortedArray = {100, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] randomSortedArray = {64, 1, 2, 23, 7, 123, 5, 2, 0, -1};
        debugMode = false;
        info(sort(emptyArray));
        info(sort(sortedArray));
        debugMode = true;
        info(sort(backSortedArray));
        debugMode = false;
        info(sort(randomSortedArray));
    }


    private static void mergeSort(int[] array, int start, int end) {
        if (end - start < 1) return;
        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        debug(array, "Before merge start=" + start + " end=" + end);
        mergeArray(array, start, middle, end);
        debug(array, "After merge start=" + start + " end=" + end);
    }

    private static void info(int[] array) {
        boolean oldDebugMode = debugMode;
        debugMode = true;
        debug(array);
        debugMode = oldDebugMode;
    }

    private static void debug(int[] array) {
        debug(array, "");
    }


    private static void debug(int[] array, String message) {
        if (!debugMode) return;
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}" + message);
    }

    private static int[] sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private static void mergeArray(int[] array, int start, int middle, int end) {
        int[] buffer = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        for (int k = start; k <= end; k++) {
            if (j > end || (i <= middle && array[i] <= array[j])) {
                buffer[k - start] = array[i++];
            } else {
                buffer[k - start] = array[j++];
            }
        }
        for (int k = start; k <= end; k++) {
            array[k] = buffer[k - start];
        }
    }

}
