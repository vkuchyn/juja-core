package ua.com.juja.study.core.presentation.io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/27/14
 * Time: 9:54 PM
 */
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Data data = new Data("text1");
        System.out.println(data);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(data);

        byte [] dataBytes = baos.toByteArray();
        System.out.println(new String(dataBytes));
        Data dataAfterSerialization = (Data) new ObjectInputStream(new ByteArrayInputStream(dataBytes)).readObject();
        System.out.println(dataAfterSerialization);
    }
}

class Data implements Serializable{
    private int i1 = 23;
    private String name = "Ім'''я";
    private transient String notSerialized;

    Data(String notSerialized){
        this.notSerialized = notSerialized;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Data{");
        sb.append("i1=").append(i1);
        sb.append(", name='").append(name).append('\'');
        sb.append(", notSerialized='").append(notSerialized).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
