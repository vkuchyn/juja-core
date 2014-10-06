package ua.com.juja.study.core.labs.if_switch.eggs_bread;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 3:59 PM
 */
public class EggsBreadTest1 {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(true, false);

        if (emptyPurchases == null)
            throw new AssertionError("Result cannot be null");

        if (emptyPurchases.equalsIgnoreCase("eggs"))
            System.out.print("OK");
    }
}
