package ua.com.juja.study.core.labs.array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 8:45 PM
 */
public class LongestArrayRange {
    public static void main(String[] args) {
        test(new int[]{0, 4}, new int[]{1, 2, 3, 4, 5});
        test(new int[]{1, 3}, new int[]{0, 1, 1, 1});
        test(new int[]{}, new int[]{-1000});
        test(new int[] {1,4}, new int [] {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0});
        test(new int[]{0,0}, new int[]{1000});
    }

    private static void test(int[] expected, int[] input) {
        int[] actual = lookFor(input);
        if (actual.length > 0)
            System.out.println(actual[0] + " " + actual[1]);
        System.out.println(Arrays.equals(expected, actual));
    }

    private static int[] lookFor(int[] array) {
        int bestLeftIndex = -1, bestRightIndex = -1, prev = -1, currentLeftIndex = -1, currentRightIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (prev <= 0) {
                    currentLeftIndex = i;
                    currentRightIndex = i;
                } else {
                    currentRightIndex = i;
                }
            } else {
                if (prev > 0) {
                    int currentLength = currentRightIndex - currentLeftIndex;
                    int bestLength = bestRightIndex - bestLeftIndex;
                    if (bestLength < currentLength || bestLeftIndex == -1) {
                        bestLeftIndex = currentLeftIndex;
                        bestRightIndex = currentRightIndex;
                    }
                }
            }
            if (i == array.length - 1) {
                int currentLength = currentRightIndex - currentLeftIndex;
                int bestLength = bestRightIndex - bestLeftIndex;
                if (bestLength < currentLength || bestLeftIndex == -1) {
                    bestLeftIndex = currentLeftIndex;
                    bestRightIndex = currentRightIndex;
                }
            }
            prev = array[i];
        }
        if (bestLeftIndex == -1 && bestRightIndex == -1)
            return new int[]{};
        return new int[]{bestLeftIndex, bestRightIndex};
    }

}
