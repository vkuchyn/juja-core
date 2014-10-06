package ua.com.juja.study.core.labs.if_switch.day_month;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 4:53 PM
 */
public class DayTest2 {
    public static void main(String[] args) {
        String tuesday = DayMonth.getDayOfTheWeek(2);

        if (tuesday == null)
            throw new AssertionError("Result cannot be null");

        if (tuesday.equalsIgnoreCase("tuesday"))
            System.out.print("OK");

    }
}
