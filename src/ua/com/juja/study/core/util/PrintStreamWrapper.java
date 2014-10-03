package ua.com.juja.study.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/2/14
 * Time: 12:22 PM
 */
public class PrintStreamWrapper extends PrintStream {
    private PrintStream wrapped;
    private String lastBuffer;

    public PrintStreamWrapper(final PrintStream wrapped) {
        super(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                wrapped.write(b);
            }
        }, false);
        this.wrapped = wrapped;
    }

    public String getLastBuffer() {
        return lastBuffer;
    }

    public void resetBuffer(){
        lastBuffer = null;
    }

    public void print(boolean b) {
        lastBuffer = b ? "true" : "false";
        wrapped.print(b);
    }

    public void print(char c) {
        lastBuffer = String.valueOf(c);
        wrapped.print(c);
    }

    public void print(int i) {
        lastBuffer = String.valueOf(i);
        wrapped.print(i);
    }

    public void print(long l) {
        lastBuffer = String.valueOf(l);
        wrapped.print(l);
    }

    public void print(float f) {
        lastBuffer = String.valueOf(f);
        wrapped.print(f);
    }

    public void print(double d) {
        lastBuffer = String.valueOf(d);
        wrapped.print(d);
    }

    public void print(char s[]) {
        lastBuffer = new String(s);
        wrapped.print(s);
    }

    public void print(String s) {
        if (s == null) {
            s = "null";
        }
        lastBuffer = s;
        wrapped.print(s);
    }

    public void print(Object obj) {
        lastBuffer = String.valueOf(obj);
        wrapped.print(obj);
    }

    public void println() {
        newLine();
    }
    
    private void newLine(){
        if (lastBuffer == null){
            lastBuffer = "";
        }
        lastBuffer += "\n";
        super.println();
    }

    public void println(boolean x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(char x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(int x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(long x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(float x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(double x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(char x[]) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(String x) {
        synchronized (wrapped) {
            print(x);
            newLine();
        }
    }

    public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (wrapped) {
            print(s);
            newLine();
        }
    }

}
