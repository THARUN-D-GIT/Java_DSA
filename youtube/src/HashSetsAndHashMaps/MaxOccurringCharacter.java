package HashSetsAndHashMaps;

import java.util.HashMap;

public class MaxOccurringCharacter {

    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int maxfreq = 0;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq > maxfreq) {
                maxfreq = freq;
            }
        }

        char ans = Character.MAX_VALUE;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq == maxfreq && ch <= ans) {
                ans = ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        // Example 1
        String s1 = "testsample";
        System.out.println("Example 1:");
        System.out.println("Input: " + s1);
        System.out.println("Output: " + getMaxOccuringChar(s1));

        // Example 2
        String s2 = "output";
        System.out.println("\nExample 2:");
        System.out.println("Input: " + s2);
        System.out.println("Output: " + getMaxOccuringChar(s2));

        // Example 3
        String s3 = "orqxvbq";
        System.out.println("\nExample 3:");
        System.out.println("Input: " + s3);
        System.out.println("Output: " + getMaxOccuringChar(s3));

        // Example 4
        String s4 = "abb";
        System.out.println("\nExample 4:");
        System.out.println("Input: " + s4);
        System.out.println("Output: " + getMaxOccuringChar(s4));
    }
}

