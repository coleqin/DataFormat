package API_One;

class MyNumberFormat
{
    public String format(double a, int n)
    {
        String str = String.valueOf(a);
        int index = str.indexOf(".");

        String temp = str.substring(index+1);
        int fractionLeng = temp.length();
        n = (int) Math.min(fractionLeng, n);
        str = str.substring(0,index+n+1);

        return str;
    }

}
public class Number_clear2 {
    public static void main(String []args)
    {
        double a = Math.sqrt(10);
        System.out.println("Before: " + a);
        MyNumberFormat myFormat=new MyNumberFormat();
        System.out.println("After: " + myFormat.format(a,5));

    }

}
