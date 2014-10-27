package ua.com.juja.study.core.presentation.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 6:15 PM
 */
public class CharsetDemo {

    public static void main(String[] args) throws Exception {
        String juja = "ДжуДжа";
        System.out.println(getBinaryRepresentation(juja, "UTF-8"));
        System.out.println(getBinaryRepresentation(juja, "cp1251"));

        System.out.println(getDefaultCharset());
        System.out.println(changeStringEncoding(juja, "cp1251"));
        System.out.println(changeStringEncoding(juja,  "UTF-8"));
        System.out.println(changeStringEncoding(juja,  "UTF-16"));
    }

    private static String changeStringEncoding(String str,  String encodingTo) throws UnsupportedEncodingException {
        byte[] strBytes = str.getBytes(encodingTo);
        return new String(strBytes, encodingTo);
    }

    private static String getDefaultCharset() {
        Charset defaultCharset = Charset.defaultCharset();
        return defaultCharset.displayName();
    }

    private static String getBinaryRepresentation(String str, String encoding) throws UnsupportedEncodingException {
        byte[] strBytes = str.getBytes(encoding);
        StringBuilder sb = new StringBuilder();
        sb.append("Length = " + strBytes.length).append(" ");
        for (int i = 0; i < strBytes.length; i++) {
            sb.append(Integer.toBinaryString(strBytes[i])).append("_");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
