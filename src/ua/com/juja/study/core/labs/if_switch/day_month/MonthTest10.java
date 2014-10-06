package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest10 {
    public static void main(String[] args) {
        String october = DayMonth.getMonthOfYear(10);

        if (october == null)
            throw new AssertionError("Result cannot be null");

        if (october.equalsIgnoreCase("october"))
            System.out.print("OK");
    }
}
