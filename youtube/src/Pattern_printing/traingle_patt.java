package Pattern_printing;

import java.util.Scanner;

public class traingle_patt {
    public static void main(String[] args) {
        /*
        printing in the format
        *
        * *
        * * *
        so on
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        /*
        to print
        1
        1 2
        1 2 3
         */
        System.out.println("===========");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("===========");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println(" ");
        }
        System.out.println("===========");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println(" ");
        }
        /*
        to print the pattern
        A
        B B
        C C C
        D D D D
         */
        System.out.println("===========");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }
        /*
        to print pattern
        1
        A B
        1 2 3
        A B C D
        1 2 3 4 5

         */
        System.out.println("===========");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0)
                System.out.print((char)(j+64)+" ");
                else
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
