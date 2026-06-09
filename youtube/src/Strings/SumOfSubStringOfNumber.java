package Strings;

import java.util.Scanner;

public class SumOfSubStringOfNumber {
    static void main(String[] args) {
        /*
        Given an integer s represented as a string, the task is to get the sum of all possible sub-strings of this string.

Note: The number may have leading zeros.
It is guaranteed that the total sum will fit within a 32-bit signed integer.

Examples:

Input: s = "6759"
Output: 8421
Explanation:
Sum = 6 + 7 + 5 + 9 + 67 + 75 + 59 + 675 + 759 + 6759 = 8421
Input: s = "421"
Output: 491
Explanation:
Sum = 4 + 2 + 1 + 42 + 21 + 421 = 491
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number string");
        String s=sc.nextLine();
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int num=Integer.parseInt(s.substring(i,j+1));
                sum+=num;
            }
        }
        System.out.println("sum of substring of a number is: "+sum);
    }
}
