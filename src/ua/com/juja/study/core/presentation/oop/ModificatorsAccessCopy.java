package ua.com.juja.study.core.presentation.oop;

public class ModificatorsAccessCopy {
    public static void main(String[] args) {
        ModificatorsDemo modificators = new ModificatorsDemo();

        System.out.println("Hello");
        //access to public
        int i = modificators.publicField;
        modificators.publicMethod();

        //access to protected
        i = modificators.protectedField;
        modificators.protectedMethod();

        //access to package-private
        i = modificators.packagePrivateField;
        modificators.packagePrivateMethod();

        //access to private
//        i = modificators.privateField;
//        modificators.privateMethod();
    }


}
