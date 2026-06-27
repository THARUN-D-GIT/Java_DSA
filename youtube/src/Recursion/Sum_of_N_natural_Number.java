package Recursion;

import java.util.Scanner;

public class Sum_of_N_natural_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("sum of first N natural number till n: "+sum(n));

    }
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);

    }
}
