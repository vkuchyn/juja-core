package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest5 {
    public static void main(String[] args) {
        String may = DayMonth.getMonthOfYear(5);

        if (may == null)
            throw new AssertionError("Result cannot be null");

        if (may.equalsIgnoreCase("may"))
            System.out.print("OK");
    }
}
