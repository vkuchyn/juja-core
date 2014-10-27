package ua.com.juja.study.core.presentation.io;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 10:02 PM
 */
public class FileSystemDemo {
    public static void main(String[] args) throws Exception {
        File rootFile = new File("./juja-core");
        printFileTree(rootFile, "");
    }

    private static void printFileTree(File rootFile, String offset) {
        System.out.println(offset + rootFile.getName());
        File[] files = rootFile.listFiles();
        if (files == null) return;
        for (int i = 0; i < files.length; i++) {
            if (!files[i].getName().contains(".git"))
                printFileTree(files[i], offset + "  ");
        }
    }
}
