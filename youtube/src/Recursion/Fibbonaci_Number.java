package Recursion;

import java.util.Scanner;

public class Fibbonaci_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        //using object creation
        Fibbonaci_Number f=new Fibbonaci_Number ();
        //f.fib
        System.out.println("fibonacci sequence sum untill:"+n+" is: "+f.fib(n));

    }
    public  int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);

    }
}
