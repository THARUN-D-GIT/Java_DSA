package Pattern_printing;

import java.util.Scanner;

public class vert_num {
    static void main(String[] args) {
        /*
        to print pattern
              1
            1 2
          1 2 3
        1 2 3 4
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        /*
        to print

              A
            B B
          C C C
        D D D D

         */
        System.out.println("================");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }

    }
}
