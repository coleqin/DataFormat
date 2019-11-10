package Comment;
/*
@Override - 检查该方法是否是重载方法。如果发现其父类，或者是引用的接口中并没有该方法时，会报编译错误。
@Deprecated - 标记过时方法。如果使用该方法，会报编译警告。
@SuppressWarnings - 指示编译器去忽略注解中声明的警告。
 */
@SuppressWarnings("all")
public class comment02 {

    @Override //重写的时候
    public String toString() {
        return "comment02{}";
    }
    @Deprecated
    public void show1(){
        //有缺陷
    }
    public void show2(){
        //代替show1方法
    }
}
