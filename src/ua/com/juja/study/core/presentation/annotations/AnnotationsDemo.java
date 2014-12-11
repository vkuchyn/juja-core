package ua.com.juja.study.core.presentation.annotations;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 12/4/14
 * Time: 12:24 PM
 */
@Juja
public class AnnotationsDemo {

    private int field;
    @Juja
    public String toStrings() {
        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return "AnnotationDemo" + String.valueOf(field);
    }
}
