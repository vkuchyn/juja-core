package ua.com.juja.study.core.presentation.enumerated;

import java.util.Arrays;

import static ua.com.juja.study.core.presentation.enumerated.EnumDemo.Seasons.AUTUMN;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 12/4/14
 * Time: 12:14 PM
 */
public class EnumDemo {
    enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Seasons season = AUTUMN;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(Arrays.toString(Seasons.values()));
        Seasons summer = Seasons.valueOf("SUMMER");
        System.out.println(summer);
        System.out.println(summer.getClass().getSuperclass().getName());
    }
}
