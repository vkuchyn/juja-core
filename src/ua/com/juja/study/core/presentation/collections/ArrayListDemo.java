package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/13/14
 * Time: 11:24 AM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayListWrapper<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
    }
}

class ArrayListWrapper<E> extends ArrayList<E> {

    ArrayListWrapper() {
        super(2);
    }

    @Override
    public boolean add(E e) {
        System.out.println("modCount=" + modCount + " before adding " + e);
        boolean res = super.add(e);
        System.out.println("modCount=" + modCount + " after adding " + e);
        return res;
    }

}

