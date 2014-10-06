package ua.com.juja.study.core.presentation;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/6/14
 * Time: 1:59 PM
 */
public class CyclesDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
        }
        System.out.println();

        int i = 0;
        while (i < 3){
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
        }
        System.out.println();

        i = 0;
        do {
            System.out.print(i + 1);
            System.out.print(" ");
            i++;
        } while (i <3);

    }

    private void arrayDemo(){
        int []array = new int [10];
        int array1 [] = new int [10];
        int array2 [] = new int [] {1,2,3};
        int [] array3 = {1,2,3,4};
        int array4 [];
        array4 = new int [] {1,2,3,4};
    }
}
