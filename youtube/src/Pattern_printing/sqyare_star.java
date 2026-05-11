package Pattern_printing;

import java.util.Scanner;

public class sqyare_star {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value pof n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
