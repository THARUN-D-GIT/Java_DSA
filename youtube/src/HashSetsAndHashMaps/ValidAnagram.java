package HashSetsAndHashMaps;


import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {

//        HashMap<Character, Integer> map = new HashMap<>();
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//
//            if (!map.containsKey(ch) || map.get(ch) == 0) {
//                return false;
//            }
//
//            map.put(ch, map.get(ch) - 1);
//        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(m1.containsKey(ch))
            {
                m1.put(ch,m1.get(ch)+1);

            }
            else m1.put(ch,1);
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!m1.containsKey(ch)) return false;
            if(m2.containsKey(ch))
            {
                m2.put(ch,m2.get(ch)+1);

            }
            else m2.put(ch,1);
        }
        for(char elem:m2.keySet())
        {
            if(!m1.containsKey(elem)) return false;
            int freq=m1.get(elem);
            int freq2=m2.get(elem);
            if(freq!=freq2) return false;
        }
        //  for(char elem:m1.keySet())
        //  {
        //     int freq=m1.get(elem);
        //     int freq2=m2.get(elem);
        //     if(freq!=freq2) return false;
        //  }
        return true;

        //return true;
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

