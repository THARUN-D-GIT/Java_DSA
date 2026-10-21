package HashSetsAndHashMaps;


import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Are Anagrams? " + isAnagram(s1, s2));

        System.out.println();

        s1 = "rat";
        s2 = "car";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Are Anagrams? " + isAnagram(s1, s2));
    }
}

