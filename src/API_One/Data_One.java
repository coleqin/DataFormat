package API_One;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Data_One {
    public static void main(String [] args){
        Date currentTime=new Date();
        System.out.println("CerrentTime"+currentTime);

        SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
        System.out.println("CerrentTime"+sdf1.format(currentTime));

        SimpleDateFormat sdf2 =new SimpleDateFormat("yy-MM-dd HH:mm:ssss(a)(EE)");
        System.out.println("CerrentTime"+sdf2.format(currentTime));

        long time=-1000L;
        Date date= new Date(time);
        System.out.println(time+"ms"+sdf2.format(date));

        time=1000L;
        date=new Date(time);
        System.out.println(time+"ma:"+sdf2.format(date));


    }
}
