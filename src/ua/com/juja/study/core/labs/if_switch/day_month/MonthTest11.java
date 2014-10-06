package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest11 {
    public static void main(String[] args) {
        String november = DayMonth.getMonthOfYear(11);

        if (november == null)
            throw new AssertionError("Result cannot be null");

        if (november.equalsIgnoreCase("november"))
            System.out.print("OK");
    }
}
