package ua.com.juja.study.core.sqlcmd.keyboard;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/8/14
 * Time: 10:05 AM
 */
public class KeyboardDispatcher {
    public static void main(String[] args) throws IOException, InterruptedException {

        String[] cmd = {"/bin/sh", "-c", "stty raw </dev/tty"};
        Runtime.getRuntime().exec(cmd).waitFor();

        while(true){
            int key = System.in.read();
            System.out.println("Input key = " + key);
            System.out.println("Input key in char = " + (char) key);
        }
    }
}
