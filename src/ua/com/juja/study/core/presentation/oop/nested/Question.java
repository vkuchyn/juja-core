package ua.com.juja.study.core.presentation.oop.nested;

public class Question {
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static class Type {
        public Type(int typeIndex) {
        }

        public int SINGLE_CHOICE = 1, MULIT_CHOICE = 2, TEXT = 3;
    }
}
