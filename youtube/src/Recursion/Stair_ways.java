package Recursion;

import java.util.Scanner;

public class Stair_ways {
    static void main(String[] args) {
        /*
        You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

         */
        System.out.println("enter the  number of stairs");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("number of ways to climb the stairs is: "+" "+stair(n));

    }
    public static int stair(int n){
        // this will give TLE error
//        if(n==1) return 1;
//        else if(n==2) return 2;
        if(n<=2) return n;
        else return stair(n-1)+stair(n-2);
    }
}
