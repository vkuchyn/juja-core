package ua.com.juja.study.core.presentation.oop;

public class OverridingDemo extends Object {
    @Override
    public String toString() {
        String superValue = super.toString();
        return "Super value is " + superValue + " Overrided toString()";
    }

    public static void main(String[] args) {
        Object overridingDemo = new A2();
        System.out.println(overridingDemo.toString());

    }
}

class A1 extends OverridingDemo{

}

class A2 extends A1{
    @Override
    public String toString() {

        return "A2" + super.toString();
    }
}
