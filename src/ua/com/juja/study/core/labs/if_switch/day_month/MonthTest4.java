package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest4 {
    public static void main(String[] args) {
        String april = DayMonth.getMonthOfYear(4);

        if (april == null)
            throw new AssertionError("Result cannot be null");

        if (april.equalsIgnoreCase("april"))
            System.out.print("OK");
    }
}
