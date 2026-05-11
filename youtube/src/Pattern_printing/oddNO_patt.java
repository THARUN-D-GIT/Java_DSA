package Pattern_printing;

import java.util.Scanner;

public class oddNO_patt {
    static void main(String[] args) {
        /*
        to print pattern
        1
        1 3
        1 3 5
        1 3 5 7
        1 3  5 7 9
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
       // int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((2*j)-1 +" ");
                //a+=2;

            }
          //  a+=2;
            System.out.println(" ");
        }

    }
}
