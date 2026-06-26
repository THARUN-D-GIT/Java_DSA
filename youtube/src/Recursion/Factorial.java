package Recursion;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        System.out.println("the fact of num is: "+fact(n));

    }
    public static int fact(int n){
        if(n==0) return 1;
        return fact(n-1)*n;
    }
}
