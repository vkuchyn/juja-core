package ua.com.juja.study.core.labs.if_switch.eggs_bread;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 3:59 PM
 */
public class EggsBreadTest3 {
    public static void main(String[] args) {
        String purchase = EggsBread.printPurchases(true, true);

        if (purchase == null)
            throw new AssertionError("Result cannot be null");

        String[] purchases = purchase.split(",");
        if (purchases.length != 2)
            throw new AssertionError("Expected 2 purchases, but was " + purchases.length);
        boolean hasEggs = false, hasBread = false;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i].equalsIgnoreCase("eggs")) hasEggs = true;
            if (purchases[i].equalsIgnoreCase("bread")) hasBread = true;
        }
        if (hasBread && hasEggs)
            System.out.print("OK");
    }
}
