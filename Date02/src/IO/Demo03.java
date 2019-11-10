package IO;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        long s=System.currentTimeMillis();
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("/Users/Coleqin/1.jpeg"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("/Users/Coleqin/1//1.jpeg"));
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(len);

        }
        bis.close();
        bos.close();
        long e=System.currentTimeMillis();
        System.out.println("一共花费了"+(e-s)+"毫秒");

    }
}
