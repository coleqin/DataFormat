package Calculate;

public class Calculat {

    @Check
    public void add(){
        System.out.println("1+2="+(1+2));
    }
    @Check
    public void dev(){
        System.out.println("1-2="+(1-2));
    }
    @Check
    public  void div(){
        System.out.println("1/0="+(1/0));
    }
    @Check
    public void mul(){
        System.out.println("1*2="+(1*2));
    }

    public void show(){
        System.out.println("没有bug");
    }
}
