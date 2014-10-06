package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest1 {
    public static void main(String[] args) {
        String january = DayMonth.getMonthOfYear(1);

        if (january == null)
            throw new AssertionError("Result cannot be null");

        if (january.equalsIgnoreCase("january"))
            System.out.print("OK");
    }
}
