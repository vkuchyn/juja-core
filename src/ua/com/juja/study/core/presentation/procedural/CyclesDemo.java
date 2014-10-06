package ua.com.juja.study.core.presentation.procedural;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 1:59 PM
 */
public class CyclesDemo {
    public static void main(String[] args) {
//        printInForLoop(3, 2);
        printInWhileLoop(3, 2);
//        printInWhileDoLoop(3, 2);
    }

    private static void printInWhileDoLoop(int size, int exclude) {
        int i = 0;
        do {
            if (i + 1 == exclude) {
                i++;
                continue;
            }
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
        } while (i < size);
        System.out.println(i);
    }

    private static void printInWhileLoop(int size, int exclude) {
        int i = 0;
        while (true){
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
            if (i == size) break;
        }
        System.out.println();
    }

    private static void printInForLoop(int size, int exclude) {
        int i;
        for (i = 0; i < size; i++) {
            if (i + 1 == exclude) continue;
            System.out.print(i + 1);
            System.out.print(" ");
        }
        System.out.println();
    }

}
