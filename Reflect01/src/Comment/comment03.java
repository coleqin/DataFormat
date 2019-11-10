package Comment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
自定义注解
格式
public @interface 注解名称{
}
 */
/*
本质
Compiled from "comment03.java"
public interface comment03 extends java.lang.annotation.Annotation {
}
注解本质上就是一个接口
属性
接口中定义的成员方法

 */
/*
元注解
@Target 用来描述注解能够作用的位置
@Retention  描述注解被保留的阶段
@documenttd 描述注解是否被抽取到Api文档中去
@inherited 描述注解是否被子类继承
用注解来描述注解
 */
@Target( value={ElementType.TYPE})
public @interface  comment03{
     public String show();//注解的属性 其返回值类型有要求 1 基本数据类型 2 字符串 3 枚举 4 数组 5 注解类型的
    //定义了属性 就要子在属性下负值
}
