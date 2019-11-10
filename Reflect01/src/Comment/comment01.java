package Comment;

/*
注解
    说明程序的给计算机看的
    相比于注释是给程序员看的JDK1.5之后的功能
    @注解名称
    JDK中定义的一部分注解
    自定义注解
    使用注解

 */
/**
 * 注解javadoc演示
 *
 * @author cole
 * @version 1.0
 * @since 1.5
 */
public class comment01 {
    public int add (int a,int b){
        /**
         * 计算两个数的和
         * @param a
         * @param b
         * @return
         */
        return a+b;

    }
}
