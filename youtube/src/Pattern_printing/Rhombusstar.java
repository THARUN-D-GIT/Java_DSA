package Pattern_printing;

import java.util.Scanner;

public class Rhombusstar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        /*
        to print pattern
         * * * * *
           * * * *
             * * *
               * *
                 *
         */
        System.out.println("===========");
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
