package ua.com.juja.study.core.labs.if_switch.array;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 5:23 PM
 */
public class ArrayFilterTest1 {
    public static void main(String[] args) {
        int [] nums = {4,3,5,2,7,3};
        int [] evens = ArrayFilter.filterEven(nums);

        if (arraysEquals(evens, new int [] {4,2})){
            System.out.print("OK");
        }
    }

    private static boolean arraysEquals(int[] actual, int[] expected) {
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] != expected[i]) return false;
        }
        return true;
    }

}
