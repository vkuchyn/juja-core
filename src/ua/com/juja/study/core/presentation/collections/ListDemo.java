package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/10/14
 * Time: 12:05 PM
 */
public class ListDemo {
    private final static String [] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
            "Sunday"};

    public static void main(String[] args) {
        List daysOfWeek = new ArrayList();
        daysOfWeek.addAll(Arrays.asList(DAYS_OF_WEEK));
        System.out.println(daysOfWeek);
        daysOfWeek.add("Friday");
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.contains("Tuesday"));
        System.out.println(daysOfWeek.contains("tuesday"));
        daysOfWeek.add(0, "Sunday");
        System.out.println(daysOfWeek);
        daysOfWeek.add(2, null);
        daysOfWeek.add(Integer.valueOf(3));
        System.out.println(daysOfWeek);
    }
}
