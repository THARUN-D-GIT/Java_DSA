package HashSetsAndHashMaps;


import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();

        int i = 0, j = 0;
        int maxlen = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (!hs.contains(ch)) {
                hs.add(ch);
                j++;
            }
            else {
                int len = j - i;
                maxlen = Math.max(maxlen, len);

                while (s.charAt(i) != s.charAt(j)) {
                    hs.remove(s.charAt(i));
                    i++;
                }

                i++;
                j++;
            }
        }

        int len = j - i;
        maxlen = Math.max(maxlen, len);

        return maxlen;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                " ",
                "dvdf"
        };

        for (String s : testCases) {
            System.out.println(
                    "Input: " + s +
                            " | Output: " + lengthOfLongestSubstring(s)
            );
        }
    }
}

