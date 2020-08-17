package com.javainuse.findmissingnumber;

public class HalfsSums {

    public static void main(String[] args) {

        int[] A= {3,1,2,4,3};
        System.out.println(calculate2(A));

//        int[] B = {1, 2, 6, 9, -1, 7, 15, 24};
//        System.out.println(calculate(B));


    }

    private static int calculate(int[] A) {

        int lowerH = 0;
        int upperH = 0;
        int currentNumber = 0;
        int minimalDifference = 100000000;
        int calculatedDifference = 0;

        for (int i = 0; i < A.length - 1; i++) {
            currentNumber = A[i];
            lowerH = lowerH + currentNumber;

            // We calculate one time and then we substract from that
            if (upperH == 0) {
                for (int j = i + 1; j < A.length; j++) {
                    upperH = upperH + A[j];
                }
            } else {
                upperH = upperH - currentNumber;
            }
            calculatedDifference = Math.abs(lowerH - upperH);
            if (calculatedDifference < minimalDifference) {
                minimalDifference = calculatedDifference;
            }

        }

        return minimalDifference;

    }

    private static int calculate2(int[] A) {

        int lowerH = 0;
        int upperH = 0;
        int currentNumber = 0;
        int minimalDifference = 100000000;
        int calculatedDifference = 0;
        int total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        upperH = total;

        for (int i = 0; i < A.length - 1; i++) {
            currentNumber = A[i];
            lowerH = lowerH + currentNumber;

            upperH -= currentNumber;

//            calculatedDifference = (lowerH - upperH) * (lowerH - upperH > 0 ?  1 : -1);
            calculatedDifference = Math.abs(lowerH - upperH);

            if (calculatedDifference < minimalDifference) {
                minimalDifference = calculatedDifference;
            }

        }

        return minimalDifference;

    }
}
