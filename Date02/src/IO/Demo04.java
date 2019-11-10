package IO;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        // BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Coleqin/text.txt", true));
        // bw.write("秦国强的macbookpro");
        //  bw.flush();
        //  bw.close();
        BufferedReader br = new BufferedReader(new FileReader("/Users/Coleqin/text.txt"));
        int len=0;
        char[] cr=new char[1024];
        while((len=br.read(cr))!=-1){
            System.out.print(new String(cr,0,len));
        }
//        String line = br.readLine();
//        System.out.println(line);
//        br.close();

    }

}
