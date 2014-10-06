package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest3 {
    public static void main(String[] args) {
        String wednesday = DayMonth.getDayOfTheWeek(3);

        if (wednesday == null)
            throw new AssertionError("Result cannot be null");

        if (wednesday.equalsIgnoreCase("wednesday"))
            System.out.print("OK");

    }
}
