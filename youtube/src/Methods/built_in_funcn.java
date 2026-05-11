package Methods;

import java.util.Scanner;

public class built_in_funcn {
    static void main(String[] args) {
      /*  System.out.println(Math.floor(7.8));
        System.out.println(Math.floor(-7.8));
        System.out.println(Math.floor(0.8));
        System.out.println(Math.ceil(7.8));
        System.out.println(Math.ceil(-7.8));
        System.out.println(Math.ceil(0.8));

       */
        //Max and min function
        //Math.max or Math.min
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(2,3));
        System.out.println(Math.min(3,4));
        // max of 3 numbers using only Max
        System.out.println(Math.max(2,(Math.max(3,5))));
        System.out.println(Math.max(a,(Math.max(b,Math.max(c,d)))));
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));



    }
}
