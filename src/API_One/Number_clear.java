package API_One;

import java.text.NumberFormat;

public class Number_clear {
    //    public void setMaximumFractionDigits(int newValue)
//    public void setMinimumFractionDigits(int newValue)
//    public void setMaximumIntegerDigits(int newValue)
//    public void setMinimumIntegerDigits(int newValue)
    public static void main(String args[]) {
        double a = Math.sqrt(10);
        System.out.println("Before: " + a);

        NumberFormat f = NumberFormat.getInstance();
        f.setMaximumFractionDigits(6);
        f.setMinimumIntegerDigits(4);
        String s = f.format(a);
        System.out.println("After: " + s);
    }

}
