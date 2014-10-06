package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest8 {
    public static void main(String[] args) {
        String august = DayMonth.getMonthOfYear(8);

        if (august == null)
            throw new AssertionError("Result cannot be null");

        if (august.equalsIgnoreCase("august"))
            System.out.print("OK");
    }
}
