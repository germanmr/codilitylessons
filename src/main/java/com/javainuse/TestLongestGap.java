package com.javainuse;

public class TestLongestGap {

    public static void main(String[] args) {

        System.out.println("0           /   0                               / gap 0: " + findLongestGap(0));
        System.out.println("31          /   11111                           / gap 0: " + findLongestGap(31));
        System.out.println("45          /   101101                          / gap 1: " + findLongestGap(45));
        System.out.println("82          /   1010010                         / gap 2: " + findLongestGap(82));
        System.out.println("123456789   /   111010110111100110100010101     / gap 3: " + findLongestGap(123456789));
        System.out.println("123456789   /   111010110111100110100010101     / gap 3: " + findLongestGap(32));

        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "            " + Integer.toBinaryString(i) + "               " + findLongestGap(i));
        }


        //collect( Collectors.toMap(p -> p[0], p -> p[1]));
//        IntStream.range(0, 100).collect(Collectors.toMap(value -> value, value -> Integer.toBinaryString((Integer) value)));
//        Map<Integer, String> integerStringMap = IntStream.range(0, 100).boxed().collect(Collectors.toMap(Integer::valueOf, Integer::toBinaryString));

//        integerStringMap.forEach((integer, s) -> System.out.println(integer + " / " + s));


    }

    private static int findLongestGap(int N) {

        String binaryString = Integer.toBinaryString(N);

        // Is there a binary gap? At least one '0' and two '1'
        boolean isThereABinaryGap = binaryString.indexOf("01") > -1 && binaryString.indexOf("01") > -1;

        if (!isThereABinaryGap) {
            return 0;
        }

        /**
         * We get the char array from N
         */
        char[] br = binaryString.toCharArray();

        int longestGap = 0;
        int currentGap = 0;

        for (int i = 0; i < br.length; i++) {

            // If we find a one the next must be a zero to start counting!
            // When zero appers we start to count start counting!
            if (br[i] == '0') {
                // If it is the last
                currentGap = currentGap + 1;
                if (currentGap > longestGap) {
                    longestGap = currentGap;
                }
            } else {
                // if we find a '1' we stop counting
                currentGap = 0;
            }

        }

        return longestGap;

    }
}
