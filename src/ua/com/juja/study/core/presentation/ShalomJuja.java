package ua.com.juja.study.core.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 9/29/14
 * Time: 10:08 AM
 */
public class ShalomJuja
{
    public static void main(String[] args)
    {
        System.out.println("Shalom JUJA");
    }

    public <T> List<T> xerox(){
        List<String> s = new ArrayList<String>();
        s.add("sdf");
        return (List<T>) s;
    }
}
