package API_One;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date= new Date();
//        String s = sdf.format(date);
//
//            Date day = sdf.parse(s);
//            System.out.println(s);


        Calendar a = Calendar.getInstance();
       // System.out.printf(String.valueOf(a));
        a.set(9999,00,12,4,65,43);
        a.add(Calendar.YEAR,5);
        Date time = a.getTime();
        System.out.println(time);
        int year = a.get(Calendar.YEAR);
        System.out.println(String.valueOf(year));
        int month = a.get(Calendar.MONTH);
        System.out.println(String.valueOf(month));
        int day1 = a.get(Calendar.DATE);
        System.out.println(day1);
    }
}
