package ObjectIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/Users/Coleqin/dext.txt"));
        Object o = ois.readObject();
        Person P=(Person)o;
        ois.close();
        System.out.println(o);
        System.out.println("-----------");
        System.out.println(P);


    }
}
