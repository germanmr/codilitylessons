package glovo.test.ex1solution2;

public class GFG {

    public static int EMPTY_VALUE = 0;

    public static void main(String[] args) {

        GFG solution = new GFG();
//        System.out.println("solution.solution(5,3): " + solution.solution(5, 3));
//        System.out.println("solution.solution(5,3): " + solution.solution(5, 1));
        System.out.println("solution.solution(5,3): " + solution.solution(487, 384));
//
//        System.out.println("solution.solution(5,3): " + solution.solution(10, 2));

    }

    public int solution(int N, int K) {

        //  ( 0 <= D <= T ) rule
        if (K > N) {
            return EMPTY_VALUE;
        }

        // We reused factorial calculation with the smallest to the biggest value!
        // When simplifying the equation we got to: multiplying(N) starting in k/ factorial(n-k)
        double dividend = 0;
        double divisor = 0;

        if (K > N - K) {
            dividend = loopFactorial(N, K + 1);
            divisor = loopFactorial(N - K, 2);
        } else {
            dividend = loopFactorial(N, N - K + 1);
            divisor = loopFactorial(K, 2);
        }

        // Checking "arithmetic exception"
        if (divisor == 0) {
            return EMPTY_VALUE;
        }

        double result = dividend / divisor;

        // Upper bound!
        if (result > 10000000) {
            return EMPTY_VALUE;
        }

        return (int) result % (10 ^ 9 + 7);
    }

    // Using loops for performance, instead of recursion!
    public static double loopFactorial(int n, int seed) {

        double fact = 1;
        if (n == 1 || n == 0) {
            return 1;
        }


        int lowerbound = (seed > 0 ? seed : 2);

        for (int i = lowerbound; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


}