package File;
/*

 */

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file= new File("cd ~//Download//");
        System.out.println(file.exists());
        System.out.println(file);
    }



}
