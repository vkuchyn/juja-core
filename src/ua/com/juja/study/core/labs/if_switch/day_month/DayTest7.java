package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest7 {
    public static void main(String[] args) {
        String sunday = DayMonth.getDayOfTheWeek(7);

        if (sunday == null)
            throw new AssertionError("Result cannot be null");

        if (sunday.equalsIgnoreCase("sunday"))
            System.out.print("OK");

    }
}
