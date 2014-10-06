package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest3 {
    public static void main(String[] args) {
        String march = DayMonth.getMonthOfYear(3);

        if (march == null)
            throw new AssertionError("Result cannot be null");

        if (march.equalsIgnoreCase("march"))
            System.out.print("OK");
    }
}
