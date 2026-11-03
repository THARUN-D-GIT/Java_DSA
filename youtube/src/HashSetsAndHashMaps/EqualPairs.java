package HashSetsAndHashMaps;

import java.util.HashMap;

public class EqualPairs {

    public static int equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        int pairs = 0;

//        for (int i = 0; i < s.length(); i++) {
//            pairs += map.get(s.charAt(i));
//        }
        //We can just add square of values
        for(int elem:map.values()) pairs+=(elem*elem);

        return pairs;
    }

    public static void main(String[] args) {
        /*
        Count Equal Pairs in String

Given a string s, count the number of pairs of indices [i, j] such that s[i] is equal to s[j]. Note that [i, j] and [j, i] are counted as different pairs, and pairs where i == j are also valid and counted.

Note: s contains only lowercase English characters.

Examples:

Input: s = "air"
Output: 3
Explanation: The only equal pairs are [0, 0], [1, 1], and [2, 2], since all characters are distinct.
Input: s = "aa"
Output: 4
Explanation: The equal pairs are [0, 0], [0, 1], [1, 0], and [1, 1].
Constraints:

1 ≤ s.size() ≤ 105
         */

        System.out.println(equalPairs("air"));      // 3
        System.out.println(equalPairs("aa"));       // 4
        System.out.println(equalPairs("abcabc"));   // 12
        System.out.println(equalPairs("aaaa"));     // 16
    }
}