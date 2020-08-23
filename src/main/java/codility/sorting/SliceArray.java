package codility.sorting;

import java.util.SortedMap;
import java.util.TreeMap;

public class SliceArray {

    public static void main(String[] args) {

//        int[] A = {1, 2, 3, 4};
//        System.out.println("Index: " + minimalSlice(A));

        int[] B = {4, 2, 2, 5, 1, 5, 8};
        System.out.println("Index: " + min(B));
//        System.out.println("Index: " + minimalSlice(B));

    }

    private static int minimalSlice(int[] A) {

        double min = 100000, avg = 0.0;
        int counter = 1, acum = 0, index = 0;

        for (int i = 0; i < A.length - 1; i++) {         //  brute force solution
            counter = 1; // We take every number as a pivot and loop througth the rest
            acum = A[i];
            for (int j = i + 1; j < A.length; j++) {
                acum += A[j];
                counter++;
                avg = (double) acum / (double) counter;
                if (avg < min) {
                    min = avg;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int min(int[] A){

        int index=0;

        SortedMap<Integer,Integer> nums = new TreeMap<Integer,Integer>();

        nums.put(0,4);
        nums.put(1,2);
        nums.put(2,2);
        nums.put(3,5);
        nums.put(4,6);



//        for (int i = 1; i < A.length; i++){
//            nums.put(A[i],i);
//        }
//
//        System.out.println(nums.firstKey());

        return index;

    }

}



