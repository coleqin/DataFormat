package IO;

import java.io.*;

/*
 电脑硬盘存储文件是永久的

 内存 临时存储

 IO input & output
 流 流的是数据 字符和字节 一个字符等于两个字节 一个字节等于等于八个二进制位
 把硬盘种的数据读入内存中使用 反过来就是输出了
 之间是硬盘数据和内存数据的相互转化
 分为字符流与字节流
 */
/*
字节流   可以读写任意的文件
字节输出流
outputStream
close()
Flash()
write 把内存的数据弄到硬盘当中
写入数据的远离 Java程序--》JVM--》OS--》调用写数据的方法 把数据写到文件中
字节输出流的使用步骤
    1 创建一个fileoutputstream对象，构造方法中传递写入数据的目的
    2 调用FilePOutPutstream对象中的write ，把数据写入文件中
    3 释放资源
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
       // FileOutputStream fos = new FileOutputStream("/Users/Coleqin/dext.txt");
        FileInputStream fis = new FileInputStream("/Users/Coleqin/dext.txt");
      //  byte[] bytes = {65, 66, 67, 68};
        //byte[] bytes2="你好".getBytes();
      //  fos.write(bytes);
        //  fos.write(bytes2);
        // fos.write(97);
       // fos.close();
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
        int len1;
    //    byte[] bytea = new byte[1024];
        while ((len1 = fis.read()) != -1) {
            System.out.println(len1);
        }
    }
}
