package IO;

import java.io.*;
import java.util.HashMap;

/*
将乱序的文本文件排序复制在另一个文件中

 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();
        BufferedReader bis = new BufferedReader(new FileReader("/Users/Coleqin/text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Coleqin/2.txt"));
        String line;
        while ((line = bis.readLine()) != null) {
            String[] arr = line.split("\\.");
            hm.put(arr[0], arr[1]);
        }
        for (String key : hm.keySet()) {
            String value = hm.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
        }
    }
}
