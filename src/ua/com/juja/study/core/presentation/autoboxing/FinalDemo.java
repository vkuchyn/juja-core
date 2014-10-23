package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 2:48 PM
 */
public  class FinalDemo {

    private static final int finalStaticField;
    private  int finalField;

    static {
        finalStaticField = 1;
    }

    public FinalDemo() {
        finalField = 3;
    }

    public static final void finalMethod(final int finalParameter) {
//        finalParameter = 3;
        new Runnable() {
            @Override
            public void run() {
                System.out.println(finalParameter);
            }
        };
    }

}

//class FinalDemoSubclass extends FinalDemo{
//
//    public void finalMethod(int finalParameter) {
//
//    }
//}
