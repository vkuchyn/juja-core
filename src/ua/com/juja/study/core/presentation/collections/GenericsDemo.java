package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/9/14
 * Time: 11:21 PM
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        collection.add(Integer.valueOf(1));
        collection.add(Integer.valueOf(2));
        collection.add("Hello");
        System.out.println(calculateSum(collection));

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
//        numbers.add("Hello");
    }

    public static int calculateSum(Collection numbers) {
        int sum = 0;
        for (Object number : numbers) {
            Integer intNum = (Integer) number;
            sum += intNum;
        }
        return sum;
    }
}
