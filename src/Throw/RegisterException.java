package Throw;
/*
   自定义异常
   java提供的异常类不够我们使用
   格式
   public class XXXException extends Execption {
   添加一个空参数的构造方法
   添加一个带异常信息的构造方法
   注意：
        一般都是以Exception 结尾，说明该类是一个异常
        都是继承于Exception那么自定义的异常类就是编译器异常，如果方法内部抛出了编译器异常，就必须处理这个异常，要么 try 要么 throws
        继承于runtimeException 那么就是运行期异常 无需处理 交给JVM

 */

import java.util.Scanner;

public class RegisterException extends Exception {
    public RegisterException() {
        super();
    }

    public RegisterException(String message) {
        super(message);
    }

}
