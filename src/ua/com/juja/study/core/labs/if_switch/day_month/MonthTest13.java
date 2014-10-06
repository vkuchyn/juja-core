package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest13 {
    public static void main(String[] args) {
        String unknownMonth = DayMonth.getMonthOfYear(13);

        if (unknownMonth == null)
            throw new AssertionError("Result cannot be null");

        if (unknownMonth.equalsIgnoreCase(""))
            System.out.print("OK");
    }
}
