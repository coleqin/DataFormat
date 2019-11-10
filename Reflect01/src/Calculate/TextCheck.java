package Calculate;

import Calculate.Calculat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TextCheck {
    public static void main(String[] args) throws Exception {
        Calculat c = new Calculat();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Coleqin/daily.text"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + "地方出现了异常");
                    bw.newLine();
                    bw.write("异常的名称" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------");

                }

            }
        }
        bw.write("本次测试一共出现了" + number + "次异常");
        bw.flush();
        bw.close();
    }

}
