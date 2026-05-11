package loops;

import java.util.Scanner;

public class Sequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int i;
        for(i=1,n=5;i<=5&&n>=1;i++,n--)
        {
            System.out.println(i);
            System.out.println(n);
        }

    }
}
