package ua.com.juja.study.core.presentation.oop;

public class OverloadingDemo {

    public static String print(String toPrint) {
        System.out.println("String print" + toPrint);
        return toPrint;
    }

    public static void print(int toPrint) {
        System.out.println("Int print " + toPrint);
    }

    public static void main(String[] args) {
        print(25);
        print("25");
    }

}
