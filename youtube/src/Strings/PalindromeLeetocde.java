package Strings;

import java.util.Scanner;

public class PalindromeLeetocde {
    static void main(String[] args) {
        /*
        the main difference between the normal palindrome and this problem is that this can contain a sentence
        for ex:
        A man, a plan, a canal: Panama
        contains uppercase and spaces etc but if we compare character by character then this is a palindrome (all lowercase)

        PROBLEM STATEMENT:
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
       if(isPalindrome(s)) System.out.println("palindrome");
       else System.out.println("not palindrome");
    }
    public static boolean isPalindrome(String s) {
        int n=s.length();
        int i=0,j=n-1;
        String s1= s.toLowerCase();
        while(i<j)
        {
            if(Character.isLetterOrDigit(s1.charAt(i)) && Character.isLetterOrDigit(s1.charAt(j))){
                if(s1.charAt(i)==s1.charAt(j)){
                    i++;
                    j--;
                }
                else return false;
            }
            else{
                if(!Character.isLetterOrDigit(s1.charAt(i))) i++;
                else j--;

                continue;
            }
        }
        return true;
    }
}
