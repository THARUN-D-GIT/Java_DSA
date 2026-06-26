package Recursion;

import java.util.Scanner;

public class Basic {
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

        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("last number u want to print in forward continous print");
        int s = sc.nextInt();
        print(n);
        System.out.println();
        prints(n,s);

    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
    public static void prints(int n,int s){
        if(n>s) return;
        System.out.print(n+" ");
        prints(n+1,s);
    }
}
