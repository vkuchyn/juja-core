package ua.com.juja.study.core.labs.juja_is_awesome;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/2/14
 * Time: 12:59 PM
 */
public class JujaIsAwesomeTest {

    public static void main(String[] args) {
        PrintStream out = System.out;
        String lastBuffer = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream wrappedStream = new PrintStream(outputStream);
            System.setOut(wrappedStream);

            JujaAwesome.printJujaIsAwesome();
            lastBuffer = new String(outputStream.toByteArray());

        } finally {
            System.setOut(out);
        }

        if (lastBuffer == null)
            throw new AssertionError("Expected to be printed <Juja is awesome> but found nothing");

        if (!lastBuffer.equalsIgnoreCase("Juja is awesome!"))
            throw new AssertionError("Expected to be printed <Juja is awesome!> but found <" + lastBuffer + ">");

        System.out.print("OK");
    }

}
