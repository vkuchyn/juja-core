package ua.com.juja.study.core.labs.if_switch.eggs_bread;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 3:31 PM
 */
public class EggsBreadTest {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(false, false);

        if (emptyPurchases == null)
            throw new AssertionError("Result cannot be null");

        if (emptyPurchases.isEmpty())
            System.out.print("OK");
    }
}
