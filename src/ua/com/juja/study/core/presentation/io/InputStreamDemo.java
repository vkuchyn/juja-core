package ua.com.juja.study.core.presentation.io;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.zip.ZipInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 6:28 PM
 */
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        class StringInputStream extends InputStream {
            StringInputStream(String text) {
                this.text = text;
            }

            private String text;
            private int currentChar = 0;

            @Override
            public int read() throws IOException {
                byte[] bytes = text.getBytes();
                if (currentChar >= bytes.length) {
                    return -1;
                }

                return bytes[currentChar++];
            }
        }

        InputStream is;
//        is = new StringInputStream("Джуджа");
//        System.out.println(readStringFromInputStream(is));
//
//        is = new StringInputStream("Джуджа");
//        System.out.println(readStringFromInputStreamWithBuffer(is));
//
//        is = new StringInputStream("JuJa");
//        System.out.println(readStringFromInputStream(is));
//
//        is = new StringInputStream("JuJa");
//        System.out.println(readStringFromInputStreamWithBuffer(is));

//        System.out.println(readFromNetwork("http://study.juja.com.ua"));

//        is = new ByteArrayInputStream("Джуджа".getBytes());
//        System.out.println(readStringFromInputStream(is));
//
//        is = new ByteArrayInputStream("Джуджа".getBytes());
//        System.out.println(readStringFromInputStreamWithBuffer(is));
//
        System.out.println(readFromFile("text.txt"));
//        System.out.println(readFromZipFile("text.zip", "text.txt"));
//
//        BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream("Джуджа".getBytes()));
//        System.out.println(readStringFromInputStreamWithBuffer(bis));
    }

    private static String readFromZipFile(String zipFilePath, String archivedFileName) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
        zis.getNextEntry();
        return readStringFromInputStreamWithBuffer(zis);
    }

    private static String readFromFile(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        return readStringFromInputStreamWithBuffer(fis);
    }

    private static String readFromNetwork(String link) throws IOException {
        URL url = new URL(link);
        InputStream is = url.openStream();
        return readStringFromInputStreamWithBuffer(is);
    }

    private static String readStringFromInputStream(InputStream is) throws IOException {
        int symbol = 0;
        StringBuilder text = new StringBuilder();
        while ((symbol = is.read()) != -1) {
            text.append((char) symbol);
        }
        return text.toString();
    }

    private static String readStringFromInputStreamWithBuffer(InputStream is) throws IOException {
        StringBuilder text = new StringBuilder();
        int incrementStep = 64;
        byte[] content = new byte[incrementStep];
        int currentByte = 0;
        byte[] buffer = new byte[incrementStep / 32];
        while (is.read(buffer) != -1) {
            if (currentByte >= content.length) {
                byte[] copy = new byte[incrementStep + content.length];
                System.arraycopy(content, 0, copy, 0, content.length);
                content = copy;
            }
            for (int i = currentByte; i < buffer.length + currentByte; i++) {
                content[i] = buffer[i - currentByte];
            }
            currentByte += buffer.length;
            buffer = new byte[2];
        }
        return new String(content);
    }

}
