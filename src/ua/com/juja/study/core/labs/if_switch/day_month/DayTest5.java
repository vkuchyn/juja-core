package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest5 {
    public static void main(String[] args) {
        String friday = DayMonth.getDayOfTheWeek(5);

        if (friday == null)
            throw new AssertionError("Result cannot be null");

        if (friday.equalsIgnoreCase("friday"))
            System.out.print("OK");

    }
}
