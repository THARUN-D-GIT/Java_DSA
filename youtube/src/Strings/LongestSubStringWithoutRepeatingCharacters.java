package Strings;

public class LongestSubStringWithoutRepeatingCharacters {
    static void main(String[] args) {
        /*
        Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
         */
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {

        int[] freq = new int[128];

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < s.length()) {

            if (freq[s.charAt(j)] == 0) {

                freq[s.charAt(j)]++;
                maxLen = Math.max(maxLen, j - i + 1);
                j++;

            } else {

                freq[s.charAt(i)]--;
                i++;
            }
        }

        return maxLen;
    }
}
