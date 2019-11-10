package API_One;

import java.math.BigInteger;

public class BIGIN {
    public static void main(String args[]) {
        BigInteger n1 = new BigInteger("987654321987654321987654321");
        BigInteger n2 = new BigInteger("123456789123456789123456789");
        System.out.println("add: " + n1.add(n2));
        System.out.println("subtract: " + n1.subtract(n2));
        System.out.println("multiply: " + n1.multiply(n2));
        System.out.println("divide: " + n1.divide(n2));
        BigInteger m = new BigInteger("77889988");
        BigInteger COUNT = new BigInteger("0");
        BigInteger ONE = new BigInteger("1");
        BigInteger TWO = new BigInteger("2");
        for (BigInteger i = TWO; i.compareTo(m) < 0; i = i.add(ONE)) {
            if ((n1.remainder(i).compareTo(BigInteger.ZERO)) == 0) {
                COUNT = COUNT.add(ONE);
            }
        }
        System.out.println(COUNT);
    }
}
