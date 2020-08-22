package com.javainuse.smallestpositiveintegerlevel2;

import java.util.Dictionary;
import java.util.Hashtable;

public class SmallestPositiveInteger {

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        find(A);
    }

    private static int find(int[] A) {

        //if non positive numbers return one
        // if no difference return biggest!
        int min = 0;
        int difference = 0;


        for (int i = 0; i < A.length; i++) {
            // Is there a Gap?
            // A[i]>0 &&
            difference = A[i] - A[i + 1];
            if ((min == 0 || A[i + 1] < min)) {
                min = A[i + 1];
            }
        }

        return min == 0 ? 1 : min;

    }


    public int findSmallestDicionary(int[] A) {

        // the minimum possible answer is 1
        int result = 1;
        // let's keep track of what we find
        Hashtable<Integer, Boolean> found = new Hashtable<Integer, Boolean>();

        // loop through the given array
        for (int i = 0; i < A.length; i++) {
            // if we have a positive integer that we haven't found before
            if (A[i] > 0 && !found.containsKey(A[i])) {
                // record the fact that we found it
                found.put(A[i], true);
            }
        }

        // crawl through what we found starting at 1
        while (found.containsKey(result)) {
            // look for the next number
            result++;
        }

        // return the smallest positive number that we couldn't find.
        return result;

    }

}
