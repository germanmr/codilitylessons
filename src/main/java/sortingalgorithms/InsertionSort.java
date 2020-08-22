package sortingalgorithms;

/**
 * For small arrays, nested loop and swapping!
 * it runs on: O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] list = {6, 7, 4, 2, 9};
        int[] sorted = insertionSort(list);

        System.out.println(sorted);

    }

    public static int[] insertionSort(int[] list) {
        int i; // outer loop
        int j; // inner loop
        int temp;
        int key; // key value!

        for (i = 1; i < list.length - 2; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                // Swap
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }

        }


        return list;
    }
}
