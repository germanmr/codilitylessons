package leetcode;
// If there is a sum, we can use the "Complement" concept to search the second value

// some_number + complement = result ----> 2 + X = 11 ---> x = 11 - 2 ---->     must be 9
// A HashTable contains complements as there is also a solution, and work with fast retrieval

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complement.containsKey(nums[i])) {
                int left = complement.get(nums[i]);
                return new int[]{left, i};
            } else
                complement.put(target - nums[i], i);
            // This line knows there is a at least a complement number to be found
        }
        return new int[2];
    }
}

class RunSolution {
    public static void main(String[] args) throws Exception {
        TwoSumSolution twoSumSolution = new TwoSumSolution();

        HashMap runs = new HashMap<Pair, int[]>();
        runs.put(new Pair(new int[]{2, 7, 11, 15}, Integer.valueOf(9)), new int[]{0, 1});
        runs.put(new Pair(new int[]{3, 2, 4}, Integer.valueOf(6)), new int[]{1, 2});
        runs.put(new Pair(new int[]{3, 3}, Integer.valueOf(6)), new int[]{0, 1});
        runs.put(new Pair(new int[]{2, 5, 5, 11}, Integer.valueOf(10)), new int[]{1, 2});

        for (Object set : runs.entrySet()) {

            Map.Entry<Pair, int[]> entry = (Map.Entry<Pair, int[]>) set;
            Pair<int[], Integer> input = entry.getKey();
            int[] result = twoSumSolution.twoSum(input.getLeft(), input.getRight());
            if (!(result[0] == entry.getValue()[0] && result[1] == entry.getValue()[1])) {
                throw new Exception("Invalid Result: " + Arrays.toString(input.getLeft()) );
            }
            System.out.println("Test case passed successfully!!");
        }


    }
}

/*
[2,5,5,11]
i
0 --
1 --
2 --
3

target = 10
complement
8,0
5,1

left =
 */

