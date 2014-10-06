package ua.com.juja.study.core.presentation.procedural;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 1:59 PM
 */
public class CyclesDemo {
    public static void main(String[] args) {
        printInForLoop(3);
        printInWhileLoop(3);
        printInWhileDoLoop();
    }

    private static void printInWhileDoLoop() {
        int i;

        i = 0;
        do {
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
        } while (i <3);
    }

    private static void printInWhileLoop(int size) {
        int i = 0;
        while (i < size){
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
        }
        System.out.println();
    }

    private static void printInForLoop(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
        }
        System.out.println();
    }

}
