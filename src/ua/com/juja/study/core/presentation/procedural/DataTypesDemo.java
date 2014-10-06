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
//        builtInCast();

    }

    private static void builtInCast() {
        byte by = -12;
        System.out.println("Byte is " + by);
        short s = (short)by;
        System.out.println("Short is casted to form " + by + " to " + s);
//        char c = by;
        char c = (char) by;
        System.out.println("Char is casted to form " + by + " to " + c);
        System.out.println("Char is casted to form " + by + " to " + (int) c);
        int i = by;
        System.out.println("Int is casted to form " + by + " to " + i);
        long l = by;
        System.out.println("Long is casted to form " + by + " to " + l);
        float f = by;
        System.out.println("Float is casted to form " + by + " to " + f);
        double d = by;
        System.out.println("Double is casted to form " + by + " to " + d);

//        by = s;
        s = 128;
        by = (byte) s;
        System.out.println("Byte is casted to form " + s + " to " + by);
//        boolean b = (byte) by;
        boolean b = true;
//        by = (byte) b;
    }



    private static void printMaxMinValues() {
        System.out.println("Byte values from " + Byte.MIN_VALUE + ".." + Byte.MAX_VALUE);
        System.out.println("Char values from " + (int) Character.MIN_VALUE + ".." + (int) Character.MAX_VALUE);
        System.out.println("Short values from " + Short.MIN_VALUE + ".." + Short.MAX_VALUE);
        System.out.println("Integer values from " + Integer.MIN_VALUE + ".." + Integer.MAX_VALUE);
        System.out.println("Long values from " + Long.MIN_VALUE + ".." + Long.MAX_VALUE);
        System.out.println("Float values from " + Float.MIN_VALUE + ".." + Float.MAX_VALUE);
        System.out.println("Double values from " + Double.MIN_VALUE + ".." + Double.MAX_VALUE);
    }
}
