package ua.com.juja.study.core.presentation.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/13/14
 * Time: 11:38 AM
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add(2, "6");
    }
}
