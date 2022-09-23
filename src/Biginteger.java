import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("3432345678765435676543");
        BigInteger bi2= new BigInteger("578678");

        BigInteger bi3 =  BigInteger.valueOf(45);
        BigInteger bi4 =  BigInteger.valueOf(8756789765789087L);

        BigInteger bi5 = BigInteger.TEN;

        BigInteger res = bi1.multiply(bi2);
        BigInteger res1 = bi4.add(bi5);

        System.out.println(res+"  "+res1);
    }
}
