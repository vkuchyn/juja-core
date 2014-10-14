package ua.com.juja.study.core.presentation.oop.inter_face;

public interface Interface extends Interface1 {
    public int i = 20;
    public static int staticInt = 21;

    //    private forbiddenMethod();

    public abstract void publicMethod();

    // this method is public
    void publicByDefaultMethod();

}

