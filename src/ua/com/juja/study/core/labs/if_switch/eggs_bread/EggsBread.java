package ua.com.juja.study.core.labs.if_switch.eggs_bread;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 3:25 PM
 */
public class EggsBread {

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String purchases = "";
        if (hasBread) purchases = "Bread";
        if (hasEggs) {
            if (hasBread){
                purchases = purchases + ",Eggs";
            } else {
                purchases = "Eggs";
            }
        }
        return purchases;
    }
}
