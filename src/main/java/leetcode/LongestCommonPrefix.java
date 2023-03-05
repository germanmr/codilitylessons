package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) throws Exception {
        LongestCommonPrefix palindrome = new LongestCommonPrefix();
        palindrome.run();
    }

    public void run() throws Exception {
        LongestCommonPrefix.Solution solution = new Solution();
        Map<String[], String> testCases = new HashMap<>();
        testCases.put(new String[]{"ab", "a"}, "a");
        testCases.put(new String[]{"a"}, "a");
        testCases.put(new String[]{"flower", "flow", "flight"}, "fl");
        testCases.put(new String[]{"dog", "racecar", "car"}, "");

        for (Map.Entry<String[], String> entry : testCases.entrySet()) {
            if (!solution.longestCommonPrefix(entry.getKey()).equals(entry.getValue())) {
                throw new Exception("Invalid result");
            }
        }
    }

    /*
    *   ["ab", "a"]					-> "a"
        ["a"]						-> ""
        ["flower","flow","flight"]	-> "fl"
        ["dog","racecar","car"]		-> ""
        the longest prefix existing in ALL Strings of the array
    *
    * */

    static class Solution {

        public String longestCommonPrefix(String[] strs) {

            if (strs.length == 1) {
                return strs[0];
            }

            Map<String, Integer> prefixes = new HashMap<>();

            for (String currentWord : strs) {
                for (int j = 1; j <= currentWord.length(); j++) {
                    String prefix = currentWord.substring(0, j);
                    if (prefixes.get(prefix) != null) {
                        Integer count = prefixes.get(prefix);
                        count++;
                        prefixes.put(prefix, count);
                    } else {
                        prefixes.put(prefix, 1);
                    }
                }
            }

            String lPrefix = "";
            for (Map.Entry<String, Integer> entry : prefixes.entrySet()) {
                if (entry.getValue() == strs.length && entry.getKey().length() > lPrefix.length()) {
                    lPrefix = entry.getKey();
                }
            }
            return lPrefix;
        }
    }
}
