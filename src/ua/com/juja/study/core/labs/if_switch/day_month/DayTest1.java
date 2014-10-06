package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest1 {
    public static void main(String[] args) {
        String monday = DayMonth.getDayOfTheWeek(1);

        if (monday == null)
            throw new AssertionError("Result cannot be null");

        if (monday.equalsIgnoreCase("monday"))
            System.out.print("OK");

    }
}
