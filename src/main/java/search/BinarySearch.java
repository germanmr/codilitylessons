package search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("Enter a letter!");
        Scanner sc = new Scanner(System.in);

        // Character input
        char c = sc.next().charAt(0);

        // Print the read value
        System.out.println("c = "+c);

        // Sorted, middle element!!
        int[] list = {1, 5, 9, 13, 14};
        int target = 9;
        int left = 0;
        int right = list.length - 1;
        int position;


//        position = binarySearchRecursive(list, target, left, right);
//        System.out.println("2?: " + position);
//
//        target = 5;
//        position = binarySearchRecursive(list, target, left, right);
//        System.out.println("1?: " + position);
//rea
//        target = 100;
//        position = binarySearchRecursive(list, target, left, right);
//        System.out.println("-1?: " + position);

        target = 13;
        position = binarySearchRecursive(list, target, left, right);
        System.out.println("3?: " + position);

//        binarySearchIterative();

    }

    private static int binarySearchRecursive(int[] list, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (list[mid] == target) {
            return mid;
        } else if (list[mid] > target) {
            // Left half!!
            return binarySearchRecursive(list, target, 0, mid - 1);
        } else {
            // Right half!!
            return binarySearchRecursive(list, target, mid + 1, right);
        }

    }
}
