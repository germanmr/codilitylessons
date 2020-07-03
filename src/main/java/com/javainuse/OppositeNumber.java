package com.javainuse;

import java.util.Collections;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OppositeNumber {

    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, 5, 6, -9, 9, 9, 9, 9};
//        findFirstNegativeDuplicated(A);
        int searchedNumber = oppositeNumberSet(A);
        System.out.println("This should be 9: " + searchedNumber);

        int A1[] = {3, 2, -2, 5, -3};
//        int searchedNumber = findFirstNegativeDuplicated(A);
        searchedNumber = oppositeNumberSet(A1);
        System.out.println("Streams - This should be 3: " + searchedNumber);

        int B[] = {3, 2, -2, 5, -3, 3, 3, 3, 3, 3, 3};
//        searchedNumber = oppositeNumber(B);
        searchedNumber = oppositeNumberSet(B);
        System.out.println("Loops - This should be three: " + searchedNumber);

        int C[] = {3, 2, -2, 5, -3, 3, 10, -10, 100000, 1, 5, 6, 9, 8, 7, -100000};
//        searchedNumber = oppositeNumber(C);
        searchedNumber = oppositeNumberSet(C);
        System.out.println("Loops - This should be 100.000: " + searchedNumber);

    }

    private static int oppositeNumber(int[] a) {

        /**
         * For every item there must be at least one opposite
         * if not we found the one we are searching
         */
        int max = 0;
        int compared = 0;
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            int searched = a[i];

            for (int j = 0; j < a.length; j++) {
                // At least one sum equals to zero
                compared = a[j];
                if ((searched + compared) == 0) {
                    //Is the biggest with an opposite?
                    if (searched > max) {
                        max = searched;
                    }

                }
            }
//            if (!found ) {
//                return searched;
//            }
        }
        return max;
    }

    private static int oppositeNumberSet(int[] a) {
        // We create a Set!
        //

        SortedSet<Integer> orderlist = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            orderlist.add(a[i]);
        }

        int index = 1;
        for (Integer number : orderlist) {
            if (index == 2) return number;
            index++;
        }

//        for (Integer i : orderlist) {
//            int seached = i;
//            for (Integer j : orderlist) {
//                if ((i + j) == 0) {
//                    return i;
//                }
//            }
//        }

        return 0;

    }

    private static int findFirstNegativeDuplicated(int[] A) {

        Integer integer1 = IntStream.of(A)
//        IntStream.of(A)
                .boxed()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.groupingBy(integer -> integer < 0 ? integer * -1 : integer, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey()))
                .limit(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);

        return integer1;
    }


}
