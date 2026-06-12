package Strings;

public class MostFrequentCharacter {
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
        String s= "output";
        int n=s.length();
        int maxfreq=-1;
        char ans=s.charAt(0);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            int freq=0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j)==ch)
                {
                    freq++;
                }
            }
            if(freq>maxfreq) {
                maxfreq=freq;
                ans=ch;
            }
            else if(freq==maxfreq && ch<ans)
            {
              ans=ch;
            }

        }
        System.out.println("most frequent character is:"+ans);
    }
}
