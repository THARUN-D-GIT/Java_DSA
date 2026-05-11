package Methods;

import java.util.Scanner;

public class Max_return {
    static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println( max(a,b,c));

    }
    public static int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>a && b>c) return b;
        else  return c;



    }
}
