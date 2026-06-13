package Strings;

public class MostFrequentCharacter_3 {
    static void main(String[] args) {
         /*
        Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
Constraints:
         */
        int [] freq=new int[26]; // default value for index=0
        String s="output";
        for(int i=0;i<s.length();i++)
        {

            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        char ans=s.charAt(0);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char)(i+97);
            }
        }

        System.out.println("most frequent character is: "+ans);
    }
}
