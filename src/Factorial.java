import java.math.BigInteger;

public class Factorial {

    static BigInteger factorial(int n){

        if(n==1) return BigInteger.ONE;
        return BigInteger.valueOf(n).
                multiply(factorial(n-1));

    }
    public static void main(String[] args) {


        System.out.println(factorial(23));
    }
}
