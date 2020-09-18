package glovo.test;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {

    public static void main(String[] args) {

//        System.out.println("11 mod 5: " + 11 % 5);

//        System.out.println("11 mod 5: " + (-11 % 5));

        System.out.println("11 mod 5: " + (-16 % 3));

        System.out.println("11 mod 5: " + Math.floorMod(-16, 3));

        int x = 16;
        int y = 3;
        int mod = (  (x % y) + y) % y;

        int i = -1 % 2;
        if (i<0) i += 2;

        System.out.println(mod);


//        Solution solution = new Solution();
//        System.out.println("solution.solution(5,3): " + solution.solution(5, 3));
//
//        System.out.println("solution.solution(5,3): " + solution.solution(10, 2));

    }

    public int solution(int T, int D) {

        //  ( 0 <= D <= T ) rule
        if (D > T) {
            return -1;
        }

        // We reused factorial calculation with the smallest to the biggest value!
        double factorialD = 0;
        double factorialTD = 0;
        double factorialT = 0;
        if (T - D < D) {
            factorialTD = loopFactorial(T - D, 2, 0);
            factorialD = loopFactorial(D, T - D + 1, factorialTD);
            factorialT = loopFactorial(T, D + 1, factorialD);
        } else {
            // If D is bigger we stat there
            factorialD = loopFactorial(D, 2, 0);
            factorialTD = loopFactorial(T - D, D + 1, factorialD);
            factorialT = loopFactorial(T, T - D + 1, factorialTD);
        }

        // Separated from equation for debugging and clarity of terms

        // Checking "arithmetic exception"
        if (factorialD == 0 || factorialTD == 0) {
            return -1;
        }

        double result = factorialT / (factorialD * factorialTD);

        // Upper bound!
        if (result > 10000000) {
            return -1;
        }

        return (int) result;
    }

    // Using loops for performance, instead of recursion!
    public static double loopFactorial(int n, int seed, double init) {

        double fact = init > 0 ? init : 1;

        for (int i = (seed > 0 ? seed : 2); i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


}