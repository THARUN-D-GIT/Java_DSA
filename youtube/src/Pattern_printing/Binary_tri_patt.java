package Pattern_printing;

import java.util.Scanner;

public class Binary_tri_patt {
    static void main(String[] args) {
        /*
        to print number in pattern
        1
        1 0
        1 0 1
        0 1 0 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    // instead u check for i+j if it is even print"1" else "0"
                    System.out.print("1"+" ");
                }
                else System.out.print("0"+" ");
            }
            System.out.println(" ");
        }
    }
}
