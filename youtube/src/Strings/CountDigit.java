package Strings;

import java.util.Scanner;

public class CountDigit {
    static void main(String[] args) {
        /*
        count the number of digits in a given number
        we can do this using loop but the task is to use string
         */
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=""+n;
        System.out.println("no of digits in the number is:"+s.length());
        double d=3.14;
        // double also gets added to the string s=raghav->s+=3-14->raghav3.14
        s+=d;
        System.out.println(s);
        /*
        string to integer we use a inbuilt function
        ex: Str="3316";
        int n=Integer.parseInt(str)

         */
        String s1="4536234654";
        int n1=Integer.parseInt(s1);
        System.out.println(n1+1);

    }
}
