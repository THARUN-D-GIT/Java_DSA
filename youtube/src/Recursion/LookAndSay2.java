package Recursion;

import java.util.Scanner;

public class LookAndSay2 {
    static void main(String[] args) {
        //using sliding window technique
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the value of n according to the look and say pattern");
        System.out.println(countAndSay(n));
    }
        public static String countAndSay(int n) {
            // code here
            if(n==1) return "1";
            String s= countAndSay(n-1);
            int i=0,j=0;
            String ans="";
            while(j<s.length())
            {
                if(s.charAt(i)==s.charAt(j)) j++;
                else{
                    int freq=j-i;
                    ans+=freq;
                    ans+=s.charAt(i);
                    i=j;
                }
            }
            int freq=j-i;
            ans+=freq;
            ans+=s.charAt(i);
            i=j;
            return ans;
        }
    }

