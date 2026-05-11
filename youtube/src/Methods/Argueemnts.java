package Methods;

import java.util.Scanner;

public class Argueemnts {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a,b,c);

    }
    public static void max(int a,int b,int c){

        if(a>b && a>c) System.out.println(a+"  is greater");
        else if(b>a && b>c) System.out.println(b+"  is greater");
        else if(c>a&&c>b) System.out.println(c+"  is greater");
        else System.out.println("all are equal");
    }
}
