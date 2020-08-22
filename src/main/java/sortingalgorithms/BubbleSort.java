package sortingalgorithms;

import java.util.Arrays;

/**
 * For small arrays, nested loop and swapping!
 * it runs on: O(n^2)
 */
public class BubbleSort {


    public static void main(String[] args) {


        int[] list = {6, 7, 1, 4, 5, 8};
        int[] sorted = bubbleSort(list);
        System.out.println(Arrays.toString(sorted));

    }

    private static int[] bubbleSort(int[] list) {

        int i; // outer loop
        int j; // inner loop
        int temp; // temp variable for swapping!

        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) { // Here we swap!!
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }


        return list;
    }
}
