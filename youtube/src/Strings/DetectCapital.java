package Strings;

public class DetectCapital {
    static void main(String[] args) {
        /*
        We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.



Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false

         */
        String s="IndiaA";
        if((detectCapitalUse(s)))
        {
            System.out.println("the capital usage is correct in your word");
        }
        else System.out.println("the capital usage is incorrect in your word");

    }public static boolean detectCapitalUse(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            // char w=word.charAt(i);
            if(Character.isUpperCase(word.charAt(i))) count++;
        }
        if(count==0) return true;
        else if(count==n) return true;
        else if (count==1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;

    }
}
