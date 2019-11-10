package ObjectIO;

import java.io.*;

/*
序列化流与反序列化流
transient 关键字
    瞬态关键字
    被transient修饰成员变量，不能被序列化

 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/Coleqin/dext.txt"));
        oos.writeObject(new Person("秦国强",20));
        oos.close();

    }
}
