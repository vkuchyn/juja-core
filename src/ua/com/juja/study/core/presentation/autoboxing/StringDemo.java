package ua.com.juja.study.core.presentation.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 4:21 PM
 */
public class StringDemo {
    public static void main(String[] args) {
        constantPoolDemo();
        reverseDemo();
        substringDemo();
        reverseDEmo();
    }

    private static void reverseDEmo() {
        String digits = "01234567890";
        System.out.println(digits.replace("0", "A"));
        System.out.println(digits.replaceAll("0", "00"));
        System.out.println(digits.replaceFirst("0", "00"));
        System.out.println(reverse(reverse(digits).replaceFirst("0", "00")));
    }

    private static void substringDemo() {
        String digits = "0123456789";
        System.out.println(digits.substring(1));
        System.out.println(digits.substring(3, 6));
        System.out.println(digits.substring(0,digits.length() - 1));
    }

    private static void reverseDemo() {
        String str = "Hello, Juja!";
        System.out.println(reverse(str));
        System.out.println(str);
        System.out.println(new StringBuilder().append(str).reverse().toString());
    }

    public static String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    private static void constantPoolDemo() {
        String str1 = "Hello!".intern();
        String str2 = "Hello!";
        System.out.println(str1 == str2);

        str1 = new String("Hello!");
        str2 = new String("Hello!");
        System.out.println(str1 == str2);

        String s1 = "jim";
        String s2 = "j" + "im";

        String s3 = "j";
        String im = "im";
        s3 = s3 + im;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
