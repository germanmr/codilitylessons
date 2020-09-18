package codility.sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeMap;

public class OddOccurrencesInArray {

    public static void main(String[] args) {

//        int[] A = {7, 6, 5, 6, 7};
        int[] A = {100};

        int found = find(A);
        System.out.println(found);
    }

    private static int find(int[] A) {

        HashMap<Integer,Boolean> finds = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            // Si no lo buscamos ya entonces puede que:
            // sea el que falta o uno repetido
            if (finds.containsKey(A[i])) {
                finds.put(A[i], true);
            } else {
                finds.put(A[i], false);
            }
        }

        for (int entry : finds.keySet()) {
            if (!finds.get(entry)) {
                return entry;
            }
        }

        return 0;
    }
}
