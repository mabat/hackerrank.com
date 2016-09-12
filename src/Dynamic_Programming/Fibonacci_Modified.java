package Dynamic_Programming;
import java.math.BigInteger;
import java.util.*;
public class Fibonacci_Modified {

    public static BigInteger solution(BigInteger t1, BigInteger t2, int n){
  
        BigInteger tn = t1.add(t2.multiply(t2));
        if (n == 3){ //t1 and t2, at third element return value
            return tn;
        }
        return solution(t2,tn,n-1);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        BigInteger t1 = scan.nextBigInteger();
        BigInteger t2 = scan.nextBigInteger();
        int n = scan.nextInt();
        BigInteger res = solution(t1,t2,n);
        System.out.println(res);
    }
}
