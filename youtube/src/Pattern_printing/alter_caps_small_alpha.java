package Pattern_printing;

import java.util.Scanner;

public class alter_caps_small_alpha {
    static void main(String[] args) {
        /* print the answer in this fromat
        a a a a
        B B B B
        c c c c
        D D D D
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of caps you want to print:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                if(i%2!=0)
                    System.out.print((char)(i+96)+" ");
                else System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }

    }
}
