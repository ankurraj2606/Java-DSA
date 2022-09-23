public class GCD {

//    Euclidean Algorithm
    static int gcd(int a, int b){
        while(a!=b) {
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }

//    Extended Euclidean algorithm
    static int gcd1(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd1(14,21));
    }
}
