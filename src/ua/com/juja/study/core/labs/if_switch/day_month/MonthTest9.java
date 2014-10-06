package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest9 {
    public static void main(String[] args) {
        String september = DayMonth.getMonthOfYear(9);

        if (september == null)
            throw new AssertionError("Result cannot be null");

        if (september.equalsIgnoreCase("september"))
            System.out.print("OK");
    }
}
