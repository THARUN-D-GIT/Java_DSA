package Pattern_printing;

import javax.swing.*;
import java.util.Scanner;

public class Xstar_patt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number(only odd no  are allowed)");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i==j||(i+j==n+1)){
                    System.out.print("*"+" ");
                }
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
