package API_One;

//class WriteWordThread extends Thread{
//    WriteWordThread(String s){
//        setName(s);
//    }
//    public void run(){
//        for(int i=0;i<=3;i++){
//            System.out.println("Thread"+getName());
//        }
//    }
//}
public class Example_1 {
    public static void main(String[] args) {
//        WriteWordThread zhang,wang;
//        zhang =new WriteWordThread("zhang");
//        wang =new WriteWordThread("wang");
//        zhang.start();
//        for(int i=1;i<=3;i++){
//            System.out.println("Main Thread");
//        }
//        wang.start();
//    }
        int[] a = {1, 2, 3};
        try {

            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("aabbccdd");
            System.out.println("秦国强的MacBook Pro");

        }finally {
            System.out.println("hello word");
        }
        System.out.println("aabbccdd");
        System.out.println("秦国强的MacBook Pro");
    }
}
