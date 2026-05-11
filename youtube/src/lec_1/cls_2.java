package lec_1;

import java.util.Scanner;

public class cls_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        if(n%5==0) System.out.println("number divisble by 5");
        else System.out.println("not divisble by 5");
        System.out.println("=============================");
        System.out.println("enter a number for absolute value test ");
        int x=sc.nextInt();
        System.out.println("absolute value is");
        if(x>0) System.out.println(x);
        else System.out.println(-x);
        // using only if
        //if (x<0) x=-x;


    }

}
