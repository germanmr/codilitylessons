package com.javainuse;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSumTwoNumbers {

    public static void main(String[] args) {

//        int[] A = {3, 1, 2};
//        System.out.println(getMax2(A));

        //
        int[] B = {-3, 1, 2, -2, 5, 6};
        System.out.println(getMax2(B));


    }

    private static int getMax2(int[] A) {

        SortedSet<Integer> nums = new TreeSet();

        int negativeNumbers = 0;
        int[] max={0,0,0};

        for (int i = 0; i < A.length; i++) {

            nums.add(A[i]);
        }

        if (negativeNumbers > 1) {

            int first = nums.first();
            nums.remove(first);
            int second = nums.first();
            int max1 = first * second;

            int last = nums.last();
            nums.remove(nums.last());
            int oLast = nums.last();
            int max2 = last * oLast;
            return max1 > max2 ? max1 : max2;

        } else {
            int last = nums.last();
            nums.remove(nums.last());
            int oLast = nums.last();
//            max = last * oLast;
        }

//        return max;

        return 0;
    }

}

