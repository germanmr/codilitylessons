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
        testCases.put(new String[]{"ab", "a"}, "a"); // Search word(first element) is longer only 2(two) elements!!
        testCases.put(new String[]{"a"}, "a"); // one element!
        testCases.put(new String[]{"flower", "flow", "flight"}, "fl"); // different word on third position
        testCases.put(new String[]{"fo", "fo", "fi"}, "f"); // different word on third position
        testCases.put(new String[]{"dog", "racecar", "car"}, ""); // no prefix, only suffix!!
        testCases.put(new String[]{"fow", "fo", "fi"}, "f"); // search word is longer

        for (Map.Entry<String[], String> entry : testCases.entrySet()) {
            if (!solution.longestCommonPrefixBruteForce(entry.getKey()).equals(entry.getValue())) {
                throw new Exception("Invalid result");
            }
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

        public String longestCommonPrefixBruteForce(String[] strs) {

            String prefix = "";
            for (int i = 1; i <= strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (i > strs[j].length() || !(strs[0].substring(0, i).equals(strs[j].substring(0, i)))) {
                        return prefix;
                    }
                }
                prefix = strs[0].substring(0, i);
            }
            return prefix;
        }

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
