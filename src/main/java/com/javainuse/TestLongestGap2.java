package com.javainuse;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestLongestGap2 {

    public static void main(String[] args) {

        System.out.println("0           /   0                               / gap 0: " + findLongestGap(0));
        System.out.println("31          /   11111                           / gap 0: " + findLongestGap(31));
        System.out.println("45          /   101101                          / gap 1: " + findLongestGap(45));
        System.out.println("82          /   1010010                         / gap 2: " + findLongestGap(82));
        System.out.println("123456789   /   111010110111100110100010101     / gap 3: " + findLongestGap(123456789));


        //collect( Collectors.toMap(p -> p[0], p -> p[1]));
//        IntStream.range(0, 100).collect(Collectors.toMap(value -> value, value -> Integer.toBinaryString((Integer) value)));
        Map<Integer, String> integerStringMap = IntStream.range(0, 100).boxed().collect(Collectors.toMap(Integer::valueOf, Integer::toBinaryString));

//        integerStringMap.forEach((integer, s) -> System.out.println(integer + " / " + s));

    }

    private static int findLongestGap(int myNumber) {

        String binaryString = Integer.toBinaryString(myNumber);

        // Is there a binary gap? At least one '0' and one '1'
        boolean isThereBinaryGap = ((binaryString.indexOf('0') > -1) && (binaryString.indexOf('1') > -1));
        if (!isThereBinaryGap) {
            return 0;
        }
//        boolean containsZeros = Integer.toBinaryString(2).chars().asLongStream().anyMatch(value -> value == '0');
//        if (!containsZeros) {
//            return 0;
//        }

        /**
         * We get the char array from myNumber
         */
        char[] br = binaryString.toCharArray();

        int longestGap = 0;
        int currentGap = 0;

        for (int i = 0; i < br.length; i++) {

            // If we find a one the next must be a zero to start counting!
            // When zero appers we start to count start counting!
//            if (longestGap == '1' && br[i + 1] == '0') {
            if (br[i] == '0') {
                currentGap = currentGap + 1;
                if (longestGap < currentGap) {
                    longestGap = currentGap;
                }
            } else {
                // if we find a one we stop counting!
                currentGap = 0;
            }

        }

        return longestGap;

    }
}
