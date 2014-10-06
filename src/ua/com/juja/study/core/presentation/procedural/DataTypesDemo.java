package ua.com.juja.study.core.presentation.procedural;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 1:10 PM
 */
public class DataTypesDemo {

    public static void main(String[] args) {
        printMaxMinValues();
        byteBuiltInCast();
    }

    private static void byteBuiltInCast() {
        byte by = 12;
        System.out.println("Byte is " + by);
        int i = by;
        System.out.println("Int is " + i);
        long l = by;

    }



    private static void printMaxMinValues() {
        System.out.println("Byte values from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Char values from " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("Short values from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer values from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long values from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float values from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double values from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}
