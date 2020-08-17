package com.javainuse.twonumbersum;

import java.util.*;

public class Program {

    // At least two integers that sum up in the array!

    public static void main(String[] args) {
        twoNumberSum(null,2);
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {


        int [] arraya = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(arraya);
        for (int i = 0; i < arraya.length; i++) {
            System.out.println(arraya[i]);
        };


        Stack<Integer> stack = new Stack<Integer>();

        if (stack.isEmpty()){
            return null;
        }

        // At least two integers that sum up in the array!
        System.out.println(array.length);

        if (array == null){
            return array;
        }

        if (array.length == 2){
            return array;
        }

        // Brute force approach!
        int i = 0;

        while (i < array.length){
            int currentNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int current2 = array[j];
                if (currentNumber + current2 == targetSum) {
                    int[] result = {currentNumber, current2};
                    return result;
                }
            }
            i++;
        }

        int[] emptyArray = {};
        return emptyArray;
    }
}
