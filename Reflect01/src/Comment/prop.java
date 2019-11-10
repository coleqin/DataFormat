package Comment;

import org.w3c.dom.ls.LSOutput;

@pro(className = "Commen.Demo1", methodName = "show")
public class prop {
    public static void main(String[] args) {
        //1.    解析注解
        //1.1  获取该类的字节码文件对象
        Class<prop> recls = prop.class;
        //获取上边的注解对象
        // 其实就是内存中生成了一个该注解接口的子类实现对象
        pro an = recls.getAnnotation(pro.class);
        //调用注解对象中定义的抽象方法 获取返回值
        String calssName = an.className();
        String methodName = an.methodName();
        System.out.println(methodName);
        System.out.println(calssName);

    }
}
//1 获取注解定义的类的对象
//2 获取指定的注解调用注解中的抽象方法获取配置的属性值