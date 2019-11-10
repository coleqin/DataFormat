package IO;

import java.io.*;
/*
一个读写一个字节，效率很慢

 */

public class Demo02 {
    public static void main(String[] args) throws IOException {
      //  FileOutputStream fos=new FileOutputStream("");
        FileInputStream fis = new FileInputStream("/Users/Coleqin/text.txt");


       // BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);

      //  bos.write("bashujuxieru".getBytes());
        byte[] bytes =new byte[1024];
        int len=0;
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //  bos.flush();
       // bos.close();
        bis.close();
    }
}
