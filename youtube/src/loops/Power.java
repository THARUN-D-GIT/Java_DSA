package loops;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a base");
        int n=sc.nextInt();
        System.out.println("enter a power");
        int p=sc.nextInt();
        int b=1;
        for(int i=1;i<=p;i++){
            b*=n;
        }
        System.out.println(b);

    }
}
