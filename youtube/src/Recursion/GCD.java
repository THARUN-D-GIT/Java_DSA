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
//       for(int i=1;i<Math.min(n1,n2);i++)
//       {
//           if(n1%i==0 && n2%i==0)
//           {
//               gcd=i;
//           }
//       }
//        System.out.println(gcd);
        /*
        using long division method
        first divide the larger number by small number
        then the divisor becomes dividend for the next step
        repeated until the remainder is 0
        a->small number->divisor
        b->larger number-> dividend
        b%a-> ==0 exits and divisor is GCD
        if not then
        a->b%a;
        b->a



         */
        //using recursion

        System.out.println(gcd(n1,n2));
        int lcm=(n1*n2)/gcd(n1,n2);
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    //use of helper function to find minimum

}
