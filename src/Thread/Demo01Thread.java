package Thread;

/*
创建一个thread类的子类
在thread子类中重写Thread中的run()方法 设置线程任务 (开启线程要做什么?)
创建Thread类的子类对象
调用Thread类中的start方法,开启新的线程,执行多线程程序,进入JVM中Java程序属于抢占式调度
对于cpu而言，他就有了两条执行的路径，cpu有自己选择的权利 我们控制不了cpu的选择
就有了随机打印的结果
一个main线程 一个新的线程 一起抢夺cpu的运行权利
多个线程之间互不影响（在不同的栈空间）
获取线程的名称 String getname（）
先获取到正在执行的线程，在使用getname
setname方法可以改变线程的名称
或者是给线程的那个子类创建一个有参数的构造方法

 */
public class Demo01Thread   {
    public static void main(String[] args) {
        Mythread mt= new Mythread();
        mt.start();
        new Mythread().start();
        new Mythread().start();
        for(int i=1;i<61;i++) {
            System.out.println(i);
        }
    }

}
