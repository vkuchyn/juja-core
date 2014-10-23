package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 1:42 PM
 */
public class AutoboxingDemo {
    public static void main(String[] args) {
//        byteDemo();
//        shortDemo();
//        charDemo();
//        integerDemo();
//        longDemo();
//        floatDemo();
        booleanDemo();
    }

    private static void booleanDemo() {
        System.out.println("Boolean demo");
        boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool);
        Boolean wrappedBoolean = bool;
        System.out.println(wrappedBoolean);
        wrappedBoolean = Boolean.FALSE;
        System.out.println(wrappedBoolean);
    }

    private static void floatDemo() {
        System.out.println("Float demo");
        float f = 1.1f;
        Float wrappedFloat = f;
        System.out.println(wrappedFloat);
        wrappedFloat = Float.parseFloat("1.2e2");
        System.out.println(wrappedFloat);
        f = wrappedFloat + 1.1f;
        System.out.println(f);
    }

    private static void longDemo() {
        System.out.println("Long demo");
        long l = 123;
        Long wrappedLong = l + 10;
        System.out.println(wrappedLong);
        l = wrappedLong;
        System.out.println(l);
        wrappedLong = Long.parseLong("1987");
        System.out.println(wrappedLong);
    }

    private static void integerDemo() {
        System.out.println("Integer demo");
        int i = 123;
        Integer wrappedInt = i;
        System.out.println(wrappedInt);
        wrappedInt = Integer.parseInt("124");
        System.out.println(wrappedInt);
    }

    private static void charDemo() {
        System.out.println("Character demo");
        char ch = 'a';
        System.out.println(ch);
        ch = 98;
        System.out.println(ch);
        Character wrappedChar = ch;
        System.out.println(wrappedChar);
    }

    private static void shortDemo() {
        System.out.println("Short demo");
        short sh = Short.valueOf("32768");
        System.out.println(sh);
        Short wrappedShort = sh;
        System.out.println(wrappedShort);
    }

    private static void byteDemo() {
        System.out.println("Byte demo");
        byte b = Byte.valueOf((byte) 10);
        System.out.println(b);
        b = Byte.parseByte("-128");
        System.out.println(b);
        Byte wrapperByte = b;
        System.out.println(wrapperByte);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
