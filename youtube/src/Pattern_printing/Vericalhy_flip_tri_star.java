package Pattern_printing;

import java.util.Scanner;

public class Vericalhy_flip_tri_star {
    static void main(String[] args) {
        /*
        to print in pattern
                *
              * *
            * * *
          * * * *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n;j++){
                if(i+j>n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ===================");
        // method 2
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
