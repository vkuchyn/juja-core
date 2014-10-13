package ua.com.juja.study.core.presentation.oop.modificators;

import ua.com.juja.study.core.presentation.oop.ModificatorsDemo;

public class OverridingModificatorsDemo extends ModificatorsDemo {

    @Override
    //extracted visibility of method
    public void protectedMethod() {
        super.protectedMethod();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
