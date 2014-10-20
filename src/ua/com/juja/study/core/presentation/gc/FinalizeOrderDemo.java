package ua.com.juja.study.core.presentation.gc;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 9:16 PM
 */
public class FinalizeOrderDemo {
    public static void main(String[] args) {
        for (int k = 0; k < 50; k++) {
            new ObjectWithFinalize(k);
        }
    }
}

class ObjectWithFinalize {
    private int index;
    private byte[] data = new byte[1_000_000];

    public ObjectWithFinalize(int index) {
        this.index = index;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize(): " + index);
    }
}
