package ua.com.juja.study.core.presentation.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/9/14
 * Time: 11:21 PM
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Collection<Box<String>> shipping = new ArrayList<>();
        Box<String> kuchynBox = new Box<>();
        shipping.add(kuchynBox);

        List<Integer> numbers = new ArrayList<>();
        sortCollection(numbers);
    }

    public static <T extends Number> List<T> sortCollection(Collection<T> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

}

class Box<I> {
    void add(I item) {
        
    }
    
    I get() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
