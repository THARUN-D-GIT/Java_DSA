package Strings;

import java.util.Arrays;

public class MostFrequentCharacter_2 {
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
        String s="output";
        char [] arr=s.toCharArray();
        int n=arr.length;
        Arrays.sort(arr);
        char ans=arr[0];
        int i=0,j=0;
        int maxfreq=0;
        while(j<n){

            if(arr[i]==arr[j]){
                j++;
            }

            else {
                int freq=j-i;
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans =arr[i];
                }
                i=j;
            }
        }
        int freq=j-i;
        if(freq>maxfreq){
            maxfreq=freq;
            ans=arr[i];
        }
        System.out.println("most frequent character is :"+ans);
    }
}
