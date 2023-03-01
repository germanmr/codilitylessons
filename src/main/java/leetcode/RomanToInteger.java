package leetcode;

import java.util.*;

public class RomanToInteger {

    public static void main(String[] args) throws Exception {
        Palindrome palindrome = new Palindrome();
        String[] strings = {};
        palindrome.run(strings);
    }

    public void run(String[] args) throws Exception {
        RomanToInteger.Solution solution = new RomanToInteger.Solution();
        Map<String, Integer> testCases = new HashMap<>();
        testCases.put("III", 3);
        testCases.put("LVIII", 58);
        testCases.put("MCMXCIV", 1994);

        for (Map.Entry<String, Integer> entry : testCases.entrySet()) {
            if (solution.romanToInt(entry.getKey()) != entry.getValue()) {
                throw new Exception("Invalid result");
            }
        }
    }

    class Solution {

        public int romanToInt(String s) {

            Map<Character, Integer> values = new HashMap<>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);

            Map<Character, Set<Character>> substraction = new HashMap<>();
            substraction.put('I', new HashSet<>(Arrays.asList('V', 'X')));
            substraction.put('X', new HashSet<>(Arrays.asList('L', 'C')));
            substraction.put('C', new HashSet<>(Arrays.asList('D', 'M')));

            int value = 0;
            int i = 0;
            while (i < s.length()) {
                char current = s.charAt(i);
                if (i + 1 > s.length() - 1) {
                    value = value + values.get(current);
                    return value;
                }
                char next = s.charAt(i + 1);

                if (substraction.get(current) != null && substraction.get(current).contains(next)) {
                    value = value + values.get(next) - values.get(current);
                    i = i + 2;
                } else {
                    value = value + values.get(current);
                    i++;
                }
            }
            return value;
        }
    }
}
