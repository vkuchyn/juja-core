package ua.com.juja.study.core.presentation.io;

import java.io.*;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 8:47 PM
 */
public class ReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(readFromString());
        System.out.println(readFromFile());
        System.out.println(readFromFileByLines());

        copyFromFileToFileWithReaderAndWriter("text.txt", "copy_text.txt");
    }

    private static void copyFromFileToFileWithReaderAndWriter(String source, String dest) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line + " {writer}");
            writer.newLine();
        }
        writer.close();
    }

    private static String readFromFileByLines() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        StringBuilder text = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            text.append(line);
        }
        return text.toString();

    }

    private static String readFromFile() throws IOException {
        FileReader fileReader = new FileReader("text.txt");
        char[] buffer = new char[32];
        StringBuilder text = new StringBuilder();
        while (fileReader.read(buffer) != -1) {
            System.out.println(Arrays.toString(buffer));
            text.append(buffer);
            buffer = new char[32];
        }
        return text.toString();
    }

    private static String readFromString() throws IOException {
        Reader reader = new StringReader("Джуджа");
        char[] chars = new char[100];
        reader.read(chars);
        System.out.println(Arrays.toString(chars));
        return new String(chars);
    }
}
