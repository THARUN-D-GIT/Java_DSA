package Pattern_printing;

import java.util.Scanner;

public class ivalue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");

        }
        System.out.println("==================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(" ");

        }
    }
}