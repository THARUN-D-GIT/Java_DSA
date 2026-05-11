package Pattern_printing;

import java.util.Scanner;

public class floyds_traingle {
    static void main(String[] args) {
        /*
        to print in the pattern
        1
        2 3
        4 5 6
        7 8 9 10
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println(" ");
        }
    }
}
