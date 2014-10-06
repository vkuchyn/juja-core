package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest6 {
    public static void main(String[] args) {
        String saturday = DayMonth.getDayOfTheWeek(6);

        if (saturday == null)
            throw new AssertionError("Result cannot be null");

        if (saturday.equalsIgnoreCase("saturday"))
            System.out.print("OK");

    }
}
