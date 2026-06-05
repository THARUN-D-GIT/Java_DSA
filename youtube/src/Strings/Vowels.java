package Strings;

import java.util.Scanner;

public class Vowels {
    static void main(String[] args) {
        //count the number of vowels in a string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int count=0;
        System.out.println("no of vowels in the string:");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') count++;
        }
        System.out.println(count);

    }
}
