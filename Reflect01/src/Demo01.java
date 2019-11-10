import java.util.jar.JarOutputStream;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入两个数 n，m");
        int n = in.nextInt();
        int m = in.nextInt();
        int count=0;
        for (int i = 10; i < n; i++) {
            int i1=i%10;
            int i2=i/10;
            if(m==(i1*i1)+(i2*i2)){
                count++;

            }
        }
        System.out.println(count);

    }
}

