package Thread;
/*
创建多线程程序的第二种方法
实现Runable接口
第一步 实现一个接口的实现类
第二步 在实现类中重写接口的run方法 让其设置线程任务
第三步 创建一个接口的实现对象
第四步 创建一个Thread类的对象 构造方法中传递Runable接口的实现类对象
第五步 start 开启新的线程 执行run

 */
public class runable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
