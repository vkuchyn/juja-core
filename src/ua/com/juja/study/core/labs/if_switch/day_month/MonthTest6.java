package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:18 PM
 */
public class MonthTest6 {
    public static void main(String[] args) {
        String june = DayMonth.getMonthOfYear(6);

        if (june == null)
            throw new AssertionError("Result cannot be null");

        if (june.equalsIgnoreCase("june"))
            System.out.print("OK");
    }
}
