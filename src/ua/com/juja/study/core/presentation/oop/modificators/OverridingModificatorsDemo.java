package ua.com.juja.study.core.presentation.oop.modificators;

import ua.com.juja.study.core.presentation.oop.ModificatorsDemo;

public class OverridingModificatorsDemo extends ModificatorsDemo {

    protected int protestedField = 1;

    @Override
    //extracted visibility of method
    public int protectedMethod() {
        System.out.println("Protected field " + this.protestedField);
        System.out.println("Protected super field " + super.protectedMethod());
        return 0;
    }

    public static void main(String[] args) {
        new OverridingModificatorsDemo().protectedMethod();
    }
}
