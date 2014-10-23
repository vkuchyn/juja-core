package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 2:23 PM
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        System.out.println(new Object() == new Object());
        System.out.println(new Integer(99) == new Integer(99));
        System.out.println(Integer.valueOf(99) == Integer.valueOf(99));
    }
}
