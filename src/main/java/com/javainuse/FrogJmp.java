package com.javainuse;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * <p>
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p>
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * <p>
 * For example, given:
 * <p>
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 * <p>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 */
public class FrogJmp {


    public static void main(String[] args) {


        int x = 10;
        int y = 85;
        int d = 30;
////        System.out.println("This should be three ( solution(x, y, d) ): " + solution(x, y, d));
//        System.out.println("This should be three: " + solutionByDividing(x, y, d) + " "+ (solutionByDividing(x, y, d)==3));
//
//        System.out.println("--------------------------------------------------------");
//        x = 0;
//        y = 1000000;
//        d = 500000;
////        System.out.println("This should be two: " + solution(x, y, d));
//        System.out.println("This should be two: " + solutionByDividing(x, y, d) + " "+ (solutionByDividing(x, y, d)==2));
//
//
//        System.out.println("--------------------------------------------------------");
//        x = 3;
//        y = 22;
//        d = 3;
////        System.out.println("This should be seven: " + solution(x, y, d));
//        System.out.println("This should be seven: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 7));
//
//        System.out.println("--------------------------------------------------------");
//        x = 0;
//        y = 5;
//        d = 5;
////        System.out.println("This should be one: " + ( solution(x, y, d) == 1) + solution(x, y, d) ) ;
//        System.out.println("This should be one: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 1));


        System.out.println("--------------------------------------------------------");
        x = 0;
        y = 999999996;
        d = 2;

        //resultado=(y - x) / d;
//        499999998 * 2
//        System.out.println("This should be 499999998: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 499999998));


        System.out.println("--------------------------------------------------------");
        x = 0;
        y = 7;
        d = 3;

        //resultado=(y - x) / d;
//        499999998 * 2
       // System.out.println("This should be 3: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 3));

        System.out.println("--------------------------------------------------------");
        x = 1;
        y = 7;
        d = 3;
      //  System.out.println("This should be 2: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 2));


        //The following issues have been detected: wrong answers.
        //For example, for the input (3, 999111321, 7) the solution returned a wrong answer (got 142730192 expected 142730189).

        System.out.println("--------------------------------------------------------");
        x = 3;
        y = 999111321;
        d = 7;
        System.out.println("This should be 142730189: " + solutionByDividing(x, y, d) + " " + (solutionByDividing(x, y, d) == 142730189));


    }
    private static int solutionByDividing(int X, int Y, int D) {


//        ✘WRONG ANSWER
//        D = 2
//        got 500000000 expected 499999998

        double doubleD = D;
        // We get the division with mod and remainder!
        double minimalJumpsDivision = (Y - X) / doubleD;

        // We extract int part of the Result
        int minimalJumps = (int) minimalJumpsDivision;
        // Here we calculate if we must add 1 jump (one) because we may have a remainder in the division
        double minimalJumpsRemainder = minimalJumpsDivision - minimalJumps;
        minimalJumps = (int) minimalJumps + (minimalJumpsRemainder > 0 ? 1 : 0);

        return minimalJumps;

    }


    private static int solution(int x, int y, int d) {
        // division solution?
        // (y - x) / d;

        // I have to incrementally get from X to Y in step D ??
        int minimalJumps = 0;
        do {
            x = x + d;
            minimalJumps++;
        } while (x < y);

        return minimalJumps;

    }

}
