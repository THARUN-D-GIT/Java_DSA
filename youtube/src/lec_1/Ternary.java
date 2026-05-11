package lec_1;

import java.util.Scanner;

/*public class Ternary {
   public  static void main(String[] args) {
         syntax for ternary operator
        condition ? true:false

        // for odd or even
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = (n%2==0) ? "even":"odd";
        System.out.println (c);

    }
} */

//import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //int c = ;
        System.out.println((n%2==0) ? "even":"odd");
    }
}