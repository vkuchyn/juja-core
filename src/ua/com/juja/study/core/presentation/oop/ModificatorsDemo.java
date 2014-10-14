package ua.com.juja.study.core.presentation.oop;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/13/14
 * Time: 12:08 PM
 */
public class ModificatorsDemo {

    // public field is accessible from any point of program
    public int publicField = 10;

    // protected field is accessible from subclasses and from inside package
    protected int protectedField = 9;

    // package-private field is accessible from inside package
    int packagePrivateField = 8;

    // private field is accessible from inside class
    private int privateField = 7;

    public void publicMethod(){
        // public method accessible from any point of program
    }

    protected int protectedMethod(){
        // protected method is accessible from subclasses and from inside package
        return protectedField;
    }

    void packagePrivateMethod(){
        // package-private method is accessible from inside package
    }

    private void privateMethod(){
        // private method is accessible from inside class
    }

    public static void main(String[] args) {

    }

}
