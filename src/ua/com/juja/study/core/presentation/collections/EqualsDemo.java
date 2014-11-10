package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
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
        Element element1 = new Element();
        list.add(element1);
        System.out.println(list);
        System.out.println(list.contains(element));
        System.out.println(list.remove(element1));
        System.out.println(list.remove(0));

    }
}

