package Strings;

import java.util.Scanner;

public class IntToString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        s+=n;
        System.out.println(s);
        // or we can use inbuilt function
        String s1=Integer.toString(n);
        System.out.println(s1);
        String s2=s1+s;
        System.out.println(s2);
    }
}
