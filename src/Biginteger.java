import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("3432345678765435676543");
        BigInteger bi2= new BigInteger("578678");

        BigInteger res = bi1.multiply(bi2);

        System.out.println(res);
    }
}
