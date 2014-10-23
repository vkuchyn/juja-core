package ua.com.juja.study.core.presentation.coins;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 12:29 PM
 */
public class RecursiveCoinsChanger {

    private static int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};
    private static boolean debugMode = false;


    public static void main(String[] args) {
        debugMode = true;
        System.out.println(calcVariants(5));
        debugMode = false;
        System.out.println(calcVariants(10));
        System.out.println(calcVariants(100));
    }

    public static int calcVariants(int cashValue) {
        return findCombination(coinNominals.length - 1, cashValue, new int [coinNominals.length]);
    }

    private static int findCombination(int nominalIndex, int cashValue, int[] combinations) {
        int sum = 0;
        int variantsCount = 0;
        while (sum < cashValue) {
            if (nominalIndex > 0) {
                variantsCount += findCombination(nominalIndex - 1, cashValue, combinations);
                clearLowNominalsCount(nominalIndex, combinations);
            }
            combinations[nominalIndex]++;
            sum = calcSum(combinations);
            if (sum == cashValue) {
                variantsCount++;
                debug(combinations);
            }
        }

        return variantsCount;
    }

    private static void debug(int[] array) {
        if (debugMode)
            System.out.println(Arrays.toString(array));
    }

    private static void clearLowNominalsCount(int nominalIndex, int[] combinations) {
        for (int j = 0; j < nominalIndex; j++) {
            combinations[j] = 0;
        }
    }

    private static int calcSum(int[] combinations) {
        int sum = 0;
        for (int i = 0; i < combinations.length; i++) {
            sum = sum + combinations[i] * coinNominals[i];
        }
        return sum;
    }

}
