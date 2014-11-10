package ua.com.juja.study.core.presentation.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/10/14
 * Time: 11:50 AM
 */
public class SetDemo {

    private final static String [] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] args) {
        Set daysOfWeek = new HashSet(Arrays.asList(DAYS_OF_WEEK));
        System.out.println(daysOfWeek);
        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.contains("Tuesday"));
        System.out.println(daysOfWeek.contains("tuesday"));
    }
}
