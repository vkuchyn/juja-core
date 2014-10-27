package ua.com.juja.study.core.presentation.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 7:41 PM
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream ous = new OutputStream() {
            byte[] bytes = new byte[1024];
            int position = 0;

            @Override
            public void write(int b) throws IOException {
                bytes[position++] = (byte) b;
                System.out.println(new String(bytes));
            }

            @Override
            public String toString() {
                return new String(bytes);
            }
        };

//        ous.write("Juja".getBytes());
//        System.out.println(ous.toString());
//        ous.write(" Джуджа".getBytes());
//        System.out.println(ous.toString());
//
//        copyFromFileToAnother("text.txt", "copy_text.txt");
        compressFileToZip("text.txt", "copy_text.zip");
    }

    private static void compressFileToZip(String source, String destZip) throws IOException {
        FileInputStream fis = new FileInputStream(source);
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(destZip));
        byte[] buffer = new byte[32];
        ZipEntry zipEntry = new ZipEntry(source );
        zip.putNextEntry(zipEntry);
        while (fis.read(buffer) != -1) {
            zip.write(buffer);
        }

        fis.close();
        zip.close();
    }

    private static void copyFromFileToAnother(String source, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fous = new FileOutputStream(dest);
        int bufferSize = 32;
        byte[] buffer = new byte[bufferSize];

        while (fis.read(buffer) != -1) {
            fous.write(buffer);
            buffer = new byte[bufferSize];
        }

        fis.close();
        fous.close();
    }


}
