package ua.com.juja.study.core.presentation.coins;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 12:48 PM
 */
public class MatrixCoinsChanger {

    private static final int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};
    public static boolean debugMode = false;

    public static void main(String[] args) {
        debugMode = true;
        System.out.println(getCombinations(5));
        debugMode = false;
        System.out.println(getCombinations(10));
        System.out.println(getCombinations(100));
    }

    private static int getCombinations(int sum) {
        if (sum <= 0) return 0;

        int num = coinNominals.length;
        int cache[][] = new int[sum + 1][num];
        int variantsWithCurrentNominalCount, previousNominalsVariantCount;

        for (int i = 0; i < num; i++) {
            cache[0][i] = 1;
        }

        for (int i = 1; i < sum + 1; i++) {
            for (int j = 0; j < num; j++) {
                //поточна сума без j-того номіналу
                int currentSum = i - coinNominals[j];
                if (currentSum >= 0) {
                    variantsWithCurrentNominalCount = cache[currentSum][j];
                } else variantsWithCurrentNominalCount = 0;

                if (j >= 1)
                    previousNominalsVariantCount = cache[i][j - 1];
                else previousNominalsVariantCount = 0;

//                debug(variantsWithCurrentNominalCount, "variantsWithCurrentNominal=");
//                debug(previousNominalsVariantCount, "previousNominalsVariantCount=");
//                debug(coinNominals[j], "nominal=");
                cache[i][j] = variantsWithCurrentNominalCount + previousNominalsVariantCount;
            }
            debugMatrix(cache, i);

        }
        return cache[sum][num - 1];
    }

    private static void debug(int x, String s) {
        if (debugMode)
            System.out.println(s + x);
    }

    private static void debugMatrix(int[][] matrix, int nominal) {
        if (!debugMode) return;

        System.out.println("i=" + nominal);
        String stringMatrix = Arrays.deepToString(matrix);
        stringMatrix = stringMatrix.replaceAll("\\], \\[", "]\n[");
        System.out.println(stringMatrix);
        System.out.println("---------------");
    }

}
