package glovo.test;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {

    public int solution(int N, int K) {

        //  ( 0 <= K <= N ) rule
        if (K > N) {
            return -1;
        }

        // Separated from equation for debugging and clarity of terms
        double factorialN = loopFactorial(N);
        double factorialK = loopFactorial(K);
        double factorialNK = loopFactorial(N - K);

        // Checking "arithmetic exception"
        if (factorialK == 0 || factorialNK == 0) {
            return -1;
        }

        double result = factorialN / (factorialK * factorialNK);

        // Upper bound!
        if (result > 10000000) {
            return -1;
        }

        return (int) result;
    }

    // Using loops for performanc, instead of recursion! 
    public static double loopFactorial(int n) {

        double fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;

        }

        return fact;
    }


}