package Pattern_printing;

import java.util.Scanner;

public class rev2_patt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        // to print number in reverse pattern
        System.out.println("number pattern is \n" +
                "================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("to print alphabets in reverse order");
        System.out.println("====================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println("");
        }
        System.out.println("to print alphabets in reverse order small");
        System.out.println("====================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 96));
            }
            System.out.println("");
        }
    }
}
