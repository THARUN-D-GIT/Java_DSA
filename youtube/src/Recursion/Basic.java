package Recursion;

import java.util.Scanner;

public class Basic {
    static int n=10;
    static void main(String[] args) {
        /*
        RECURSION:
                    METHOD CALLING ITSELF UNTIL A SPECIFIC CONDITION IS SATISFIED
                    (ALSO CALLED AS BASE CONDITION)
                    -> if there is no condition it will be stack overflow error
                    (infinite) loop error
                    ->it can be stopped by taking an parameter in the function
                    ->A function terminates if the "return" statement is executed or
                    if its all executable parts are done

         */
        //question print  numbers from reverse order
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        System.out.println("last number u want to print in forward continous print");
//        int s = sc.nextInt();
        print(n);
//        System.out.println();
//        prints(n,s);

    }
    public static void print(int n){
        int s=0;
//        if(n==0) return;
//        System.out.print(n+" ");
//        print(n-1);
        //method 2 using global variable
//        if(n==0) return;
//        System.out.println(n);
//        print(n-1);
        //method 3 using call back
        if(n==0) return;
        print(n-1);
        System.out.println(n+" ");
        // DRY RUN THIS ONCE

    }
//    public static void prints(int n,int s){
//        if(n>s) return;
//        System.out.print(n+" ");
//        prints(n+1,s);
//    }
}
