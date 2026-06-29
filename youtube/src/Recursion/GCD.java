package Recursion;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        /*
        calculate GCD/HCF of 2 given number
        6,12
        12
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
       for(int i=1;i<Math.min(n1,n2);i++)
       {
           if(n1%i==0 && n2%i==0)
           {
               gcd=i;
           }
       }
        System.out.println(gcd);
    }

}
