package API_One;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        String DOW = String.valueOf(calendar.get(calendar.DAY_OF_WEEK) - 1);
        System.out.println(DOW);

        calendar.set(1931, 8, 18);
        long timeOne = calendar.getTimeInMillis();

        calendar.set(1945, 7, 15);
        long timeTwo = calendar.getTimeInMillis();
        long days = (timeTwo - timeOne) / (1000 * 60 * 60 * 24);
        System.out.println("1945年8月15日和1931年9月18日相隔" + days + "天");


    }
}
