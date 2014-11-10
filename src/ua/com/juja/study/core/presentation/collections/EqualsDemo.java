package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/10/14
 * Time: 11:31 AM
 */
public class EqualsDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        Element element = new Element();
        list.add(element);
        list.add(new Element());
        System.out.println(list);
        System.out.println(list.contains(element));
        System.out.println(list.remove(element));
        System.out.println(list.remove(0));

    }
}

class Element{
    private static int objectLastNumber = 0;

    private int objectNumber = objectLastNumber++;

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "element" + objectNumber;
    }
}
