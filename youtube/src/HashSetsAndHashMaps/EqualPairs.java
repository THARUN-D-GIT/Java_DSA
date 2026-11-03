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

        for (int i = 0; i < s.length(); i++) {
            pairs += map.get(s.charAt(i));
        }

        return pairs;
    }

    public static void main(String[] args) {

        System.out.println(equalPairs("air"));      // 3
        System.out.println(equalPairs("aa"));       // 4
        System.out.println(equalPairs("abcabc"));   // 12
        System.out.println(equalPairs("aaaa"));     // 16
    }
}