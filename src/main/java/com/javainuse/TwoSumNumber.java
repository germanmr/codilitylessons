package com.javainuse;

import java.util.Hashtable;

public class TwoSumNumber {


    public static void main(String[] args) {
        // brute force approach


        Hashtable<Integer,Boolean> calculated = new Hashtable<Integer,Boolean>();
        Integer calculatedNumber = Integer.valueOf(1);
        Boolean aBoolean = calculated.get(1);

        for(Integer number : calculated.keySet() )
        {
            System.out.println("number: " + number);
        }


//        int[] array = {6, 1, 4, 8};
//        int targetSum = 9;
//
//        System.out.println("Find 9: " + twoNumberSumBruteForce(array, targetSum));


    }

    private static int[] twoNumberSumBruteForce(int[] array, int targetSum) {

        // At least two integers that sum up in the array!
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

            int[] emptyArray= {};
            return emptyArray;
        }
}
