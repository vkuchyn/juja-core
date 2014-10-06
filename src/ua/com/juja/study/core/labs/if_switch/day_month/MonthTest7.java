package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest7 {
    public static void main(String[] args) {
        String july = DayMonth.getMonthOfYear(7);

        if (july == null)
            throw new AssertionError("Result cannot be null");

        if (july.equalsIgnoreCase("july"))
            System.out.print("OK");
    }
}
