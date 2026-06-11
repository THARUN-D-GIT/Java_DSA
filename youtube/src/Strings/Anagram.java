package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void main(String[] args) {
        /*
        Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy"
Output: false
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
Input: s1 = "listen", s2 = "lists"
Output: false
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
Constraints:
1 ≤ s1.size(), s2.size() ≤ 105
s1, s2 consists of lowercase English letter
         */
       Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 string u have comapre" );
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        char [] arr1=s1.toCharArray();
        char [] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag=true;
        if (n1!=n2) flag = false;
        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i]){
                flag=false;
                break;
            }

        }
        if(flag==true){
            System.out.println("the entered 2 strings are anagram of each others");
        }
        else System.out.println("not anagram");


    }
}
