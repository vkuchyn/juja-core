package ua.com.juja.study.core.labs.if_switch.array;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 5:22 PM
 */
public class ArrayFilter {

    public static int [] filterEven(int [] nums){
        int [] res = new int [nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[counter] = nums[i];
                counter++;
            }
        }
        return res;
    }
}
