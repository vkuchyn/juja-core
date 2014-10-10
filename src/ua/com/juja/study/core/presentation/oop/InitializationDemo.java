package ua.com.juja.study.core.presentation.oop;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/9/14
 * Time: 9:08 PM
 */
public class InitializationDemo {
    public static void main(String[] args) {
        Father father = new Father("Bob");
        System.out.println(father.getName());

        Father child = new Child("Junior Bob");
        System.out.println(child.getName());
//        System.out.println(child.getChildName());
    }
}

class Father extends Object{
    //місце оголошення поля
    //1
    String name = "NameInField";

    //блок ініціалізації
    //2
    {
        name = "NameInInitBlock";
    }

    Father(String name) {
        //3
        super();
        this.name = "NameInCounstructor " + name;
    }

    String getName() {
        return name;
    }
}

class Child extends Father{

    Child(String name) {
        super(name);
    }

    String getChildName(){
        return super.getName() + "child";
    }

}
