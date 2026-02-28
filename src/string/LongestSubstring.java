package string;

import java.util.HashSet;

public class LongestSubstring {
    /*
     * 3. Longest Substring Without Repeating Characters
     * Medium
     * Topics
     * premium lock icon
     * Companies
     * Hint
     * Given a string s, find the length of the longest substring without duplicate
     * characters.
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3. Note that "bca" and
     * "cab" are also correct answers.
     * Example 2:
     * 
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * 
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a
     * substring.
     */

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                StringBuilder tempb = new StringBuilder();

                tempb.append(temp);
                tempb.append(s.charAt(j));

                if (isUnique(tempb)) {
                    System.out.println("tempb->" + tempb);
                    temp.append(s.charAt(j));
                } else {
                    System.out.println("out->" + temp);
                    j = s.length();
                }
            }
            System.out.println(temp);
            if (result < temp.length()) {
                result = temp.length();
            }
        }
        return result;
    }

    public static boolean isUnique(StringBuilder s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                return false;
            }

            set.add(ch);
        }

        return true;

    }

}
