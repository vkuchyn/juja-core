package ua.com.juja.study.core.presentation.oop;

public class OverridingDemo extends Object {
    @Override
    public String toString() {
        String superValue = super.toString();
        return "Super value is " + superValue + " Overrided toString()";
    }

    public static void main(String[] args) {
        Object overridingDemo = new OverridingDemo();
        System.out.println(overridingDemo.toString());

    }
}
