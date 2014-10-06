package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest4 {
    public static void main(String[] args) {
        String thursday = DayMonth.getDayOfTheWeek(4);

        if (thursday == null)
            throw new AssertionError("Result cannot be null");

        if (thursday.equalsIgnoreCase("thursday"))
            System.out.print("OK");

    }
}
