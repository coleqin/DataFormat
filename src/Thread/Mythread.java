package Thread;

public class Mythread extends Thread {
    @Override
    public void run() {
        String name = getName();
        System.out.println(name); //新线程就是Thread—0
//        Thread t = Thread.currentThread();
//        System.out.println(t);
    //    System.out.println(Thread.currentThread().getName());
    }
}
