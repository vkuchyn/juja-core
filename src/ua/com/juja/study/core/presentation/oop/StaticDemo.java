package ua.com.juja.study.core.presentation.oop;

public class StaticDemo {
    public static int staticField = 11;
    public int nonStaticField = 10;

    public static void staticMethod() {
        // method from static context
        System.out.println("Calling static method");
    }

    public void setNonStaticMethod() {
        // method from non-static context
        System.out.println("Calling non-static method");
    }

    public static void main(String[] args) {
        System.out.println(StaticDemo.staticField);

//        System.out.println(nonStaticField);

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.nonStaticField = 9;
        System.out.println(staticDemo.nonStaticField);
        System.out.println(staticDemo.staticField);
//
        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(staticDemo1.nonStaticField);
        staticDemo1.staticField = 13;


        System.out.println(staticDemo.staticField);
        System.out.println(StaticDemo.staticField);
    }
}
