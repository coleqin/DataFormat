package Thread;

public class Dome02Thread {


    public static void main(String[] args) {
//        runable run= new runable();
//        Thread t=new Thread(run);
//        t.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "黑马");
                }

            }
        }.start();

        Runnable r=new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "程序员");
                }

            }
        };
        new Thread(r).start();
    }
}
