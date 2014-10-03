package ua.com.juja.study.core;

public class Main {

    public static void main(String[] args) {
        big_loop:
        for (int i = 0; i < 3 ; i++) {
            try {
                for (int j = 0; j < 3 ; j++) {
                    if (i == j) continue ;
                    else if (i > j) continue big_loop;
                    System.out.print("A");
                }
            } finally {
                System.out.print("B");
            }
            System.out.print("С");
        }
    }

}
