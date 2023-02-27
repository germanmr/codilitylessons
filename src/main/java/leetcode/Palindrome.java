package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public static void main(String[] args) throws Exception {
        Palindrome palindrome = new Palindrome();
        String[] strings = {};
        palindrome.run(strings);
    }

    public void run(String[] args) throws Exception {
        Palindrome.Solution solution = new Palindrome.Solution();
        Map<Integer, Boolean> testCases = new HashMap<>();
        testCases.put(121, true);
        testCases.put(5, true);
        testCases.put(-121, false);
        testCases.put(121, true);
        testCases.put(12321, true);
        testCases.put(5698965, true);

        for (Map.Entry<Integer, Boolean> entry : testCases.entrySet()) {
            if (solution.isPalindrome(entry.getKey()) != entry.getValue()) {
                throw new Exception("Invalid result");
            }
        }
    }

    class Solution {

        // No Strings!!!
        // Module function (%) give us the last digit(rest) of a number
        // Multiplying by ten and then adding, give us a new "reverse number"
        // Division by 10 gives you a number without the last digit(Rest)
        public boolean isPalindrome(int x) {
            int rev = 0;
            int original = x;
            while (x != 0) {
                int num = x % 10;
                rev = rev * 10 + num;
                x = x / 10;
            }

            if (original >= 0 && original == rev) {
                return true;
            }

            return false;
        }

//        public boolean isPalindrome(int x) {
//
//            if (0 > x) {
//                return false;
//            }
//            if (0 <= x && x < 10) {
//                return true;
//            }
//
//            String stringX = x + "";
//            int j = stringX.length() - 1;
//
//            for (int i = 0; i < stringX.length() / 2; i++) {
//                if (stringX.charAt(i) != stringX.charAt(j)) {
//                    return false;
//                }
//                j--;
//            }
//            return true;
//        }
    }
}
