package codility.sorting;

import java.util.HashMap;
import java.util.Hashtable;

public class Distinct {

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        hashtable1(A);
    }

    /**
     * Hashtable - For Thread applications!
     * Use HasMap for non threads applications!
     *
     * @param A
     * @return
     */
    public static int hashtable1(int A[]) {
        //
        Hashtable<Integer, Boolean> difs = new Hashtable<Integer, Boolean>();

        for (int i = 0; i < A.length; i++) {
            difs.put(A[i], true);
        }

        return difs.size();
    }

    /**
     * Hashtable with counter
     * Better use size method!
     *
     * @param A
     * @return
     */
    public static int hashtableWithCounter(int[] A) {

        int counter = 0;

        Hashtable<Integer, Boolean> difs = new Hashtable<Integer, Boolean>();

        for (int i = 0; i < A.length; i++) {
            if (!difs.containsKey(A[i])) {
                difs.put(A[i], true);
                counter++;
            }
        }

        return counter;
    }

    /**
     * HashMap - Non threads apps. Performance: 0.420
     * Use {@link HashMap} instead of {@link Hashtable} this for simple non threads apps!!
     *
     * @param A
     * @return
     */
    public static int hashMap(int[] A) {

        HashMap<Integer, Boolean> difs = new HashMap<Integer, Boolean>();

        for (int i = 0; i < A.length; i++) {
            difs.put(A[i], true);
        }

        return difs.size();
    }

    /**
     * HashMap with counter. Performance: 0.428 s
     * Use size method better
     *
     * @param A
     * @return
     */
    public static int hasMapWithCounter(int[] A) {

        int counter = 0;

        HashMap<Integer, Boolean> difs = new HashMap<Integer, Boolean>();

        for (int i = 0; i < A.length; i++) {
            if (difs.put(A[i], true) == null) {
                counter++;
            }
        }

        return counter;
    }

}
