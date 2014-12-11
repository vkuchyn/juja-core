package ua.com.juja.study.core.presentation.reflection;

import ua.com.juja.study.core.presentation.annotations.AnnotationsDemo;
import ua.com.juja.study.core.presentation.annotations.Juja;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 12/4/14
 * Time: 12:35 PM
 */
@Juja
public class ReflectionDemo {
    public int field1;

    public static void main(String[] args) throws Exception {
        Object obj = new A();

        System.out.println((obj.getClass() == ReflectionDemo.class) ? "obj instanceof Object" : "obj not instanceof Object");
    }

    @Override
    public String toString() {
        return "ReflectionDemo" + String.valueOf(field1);
    }

    private static class A extends ReflectionDemo{
        @Override
        public String toString() {
            return "A" + String.valueOf(field1);
        }
    }
}
