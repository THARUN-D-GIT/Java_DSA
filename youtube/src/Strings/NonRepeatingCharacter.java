package Strings;

public class NonRepeatingCharacter {
    static void main(String[] args) {
       /* Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

                Examples:

        Input: s = "geeksforgeeks"
        Output: 'f'
        Explanation: In the given string, 'f' is the first character in the string which does not repeat.
                Input: s = "racecar"
        Output: 'e'
        Explanation: In the given string, 'e' is the only character in the string which does not repeat.
                Input: s = "aabbccc"
        Output: '$'
        Explanation: All the characters in the given string are repeating.


        */
        String s="geeksforgeeks";
        System.out.println(nonRepeatingChar(s));


    }
    public  static char nonRepeatingChar(String s) {
        // code here
        int n=s.length();
        //char arr[]=s.toCharArray();
        int [] freq= new int [26];
        //int maxfreq=-1;
        //char ans=s.charAt(0);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);

            int idx=ch-'a';
            freq[idx]++;

        }
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(freq[idx]==1) return ch;
        }
        return '$';
    }
}
