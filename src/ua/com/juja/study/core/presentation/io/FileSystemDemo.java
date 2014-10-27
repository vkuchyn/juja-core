package ua.com.juja.study.core.presentation.io;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 10:02 PM
 */
public class FileSystemDemo {
    public static void main(String[] args) throws Exception {
        File rootFile = new File("");
//        printFileTree(rootFile, "");
        File file = new File(rootFile, "temp/sandbox/temp.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) {
            file.getAbsoluteFile().getParentFile().mkdirs();
            file.getAbsoluteFile().createNewFile();
        }
    }

    private static void printFileTree(File rootFile, String offset) throws IOException {
        System.out.println(offset + rootFile.getName());
        File[] files = rootFile.listFiles();
        rootFile.isDirectory();
        rootFile.isFile();
        rootFile.exists();
        rootFile.createNewFile();
        rootFile.getParentFile().mkdirs();
        if (files == null) return;
        for (int i = 0; i < files.length; i++) {
            if (!files[i].getName().contains(".git"))
                printFileTree(files[i], offset + "  ");
        }
    }
}
