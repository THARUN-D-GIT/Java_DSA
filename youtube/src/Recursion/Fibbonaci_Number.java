package Recursion;

import java.util.Scanner;

public class Fibbonaci_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        //using object creation
       // Fibonacci_Number f=new Fibonacci_Number ();
        //f.fib
        //System.out.println("Fibonacci sequence sum until:"+n+" is: "+f.fib(n));

        //using for loop
         int a=0,b=1;
         for(int i=0;i<n;i++){
             System.out.print(a+" ");
             int c=a+b;
             a=b;
             b=c;
         }


    }
    public  int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);

    }
}
