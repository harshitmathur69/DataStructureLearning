package BigIntergerAndBigDecimal;

import java.math.BigInteger;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        BD();
    }
    static void BD(){
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal A = new BigDecimal("123456789161718.101112131415");
        BigDecimal B = new BigDecimal("19202122232425.262728293031");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);
        System.out.println(B.multiply(A));
        System.out.println(B.remainder(A));
        System.out.println(B.pow(2));
        System.out.println(B.compareTo(A));
    }

    static void BI(){
        BigInteger A = BigInteger.valueOf(46544846);
        BigInteger B = BigInteger.valueOf(44842);
        // Constants
        BigInteger C = BigInteger.TEN;
        // Addition
        BigInteger D = A.add(B);
        // Number as a String
        BigInteger S = new BigInteger("15115346217927223422727612795");
        BigInteger X = new BigInteger("14486577371292179538645973982");
        BigInteger Z = S.add(X);
        BigInteger M = S.multiply(X);
        BigInteger s = S.subtract(X);
        BigInteger d = S.divide(X);
        BigInteger rem = S.remainder(X);
        System.out.println(rem);
        System.out.println(Factorial.fact(102));
    }
}
