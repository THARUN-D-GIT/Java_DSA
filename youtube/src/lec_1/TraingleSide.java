package lec_1;

import java.util.Scanner;

public class TraingleSide {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* rules to check whether the given set of sides or triangle or not is
        if sum od any two sides is greater than the other
        for ex: a,b,c are the sides then
        a+b>c and b+c>a c+a>b all rules must be satisfied
         */
        System.out.println("enter the sides of triangle one by one");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("valid traingle");
        else
            System.out.println("not a valid triangle");

    }
}
