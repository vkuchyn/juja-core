package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest12 {
    public static void main(String[] args) {
        String december = DayMonth.getMonthOfYear(12);

        if (december == null)
            throw new AssertionError("Result cannot be null");

        if (december.equalsIgnoreCase("december"))
            System.out.print("OK");
    }
}
