package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 2:23 PM
 */
public class ImmutableDemo {
    public static void main(String[] args) {
//        System.out.println(new Object() == new Object());
//        System.out.println(new Integer(99) == new Integer(99));
//        Integer i1 = 100 + 27;
//        System.out.println(i1 == Integer.valueOf(127));
        saveObjectToFile(Integer.valueOf(99));
        saveObjectToFile(99);
//        99.toString();
    }

    public static void saveObjectToFile(int i) {

    }

    public static void saveObjectToFile(double d) {

    }


    public static void saveObjectToFile(Object obj) {
        obj.toString();
        System.out.println("Saving to file " + obj.toString());
    }
}
