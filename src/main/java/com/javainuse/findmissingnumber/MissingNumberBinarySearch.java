package com.javainuse.findmissingnumber;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

public class MissingNumberBinarySearch {

    public static void main(String[] args) {
        // write your code in Java SE 8

        int[] A = { 1, 2, 3, 5};

        int found = split(A);

        System.out.println("found: " + found);
    }

    public static int split(int[] A) {

        System.out.println("Called!");

        for (int i = 0; i < A.length; i++) {
            // System.out.println("Array: " + A[i]);
        }

        Arrays.sort(A);

        int elementHalf = A.length / 2;
        elementHalf += A.length % 2 > 0 ? 1 : 0;

        System.out.println("elementHalf: " + elementHalf);

        // We will keep splitting the array if the count is not under 3!
        if (A.length < 4) {
            // Analize the array!
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] + 1 != A[i + 1]) {
                    return A[i] + 1;
                }
            }

            // Return the MAX to be compared
            return A[A.length - 1];
        } else {
            // Pass new array
            // Split again
            // Upper half
            System.out.println("elementHalf: " + elementHalf);
            int lowerHalf = split(Arrays.copyOfRange(A, 0, elementHalf));

            System.out.println("lowerHalf: " + lowerHalf);

            // Lower half
            int upperHalf = split(Arrays.copyOfRange(A, elementHalf, A.length));

            System.out.println("lowerHalf: " + upperHalf);

            if (lowerHalf + 1 != upperHalf) {
                return lowerHalf;
            }
        }
        return 0;

    }


}
