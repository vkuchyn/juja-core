package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest2 {
    public static void main(String[] args) {
        String february = DayMonth.getMonthOfYear(2);

        if (february == null)
            throw new AssertionError("Result cannot be null");

        if (february.equalsIgnoreCase("february"))
            System.out.print("OK");
    }
}
