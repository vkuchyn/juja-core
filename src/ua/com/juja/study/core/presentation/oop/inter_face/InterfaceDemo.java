package ua.com.juja.study.core.presentation.oop.inter_face;

public class InterfaceDemo implements Interface{

    public void publicMethod() {

    }

    public void newMethod() {

    }

    public void publicByDefaultMethod() {

    }

    public static void main(String[] args) {
        Interface i1 = new InterfaceDemo();
        i1.publicMethod();

        Interface1 i2 = new InterfaceDemo();
        i2.publicMethod();

    }
}
