package Pattern_printing;

import java.util.Scanner;

public class reverse_tri_pattern {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++  ){// for int j=n;j>=i;j-- but it will give 5 4 3 2 1like this instead of  1 2 3 4 5
                System.out.print("* ");
            }
            System.out.println(" ");

        }
        System.out.println("===========");
        int a=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){ //
                System.out.print("* ");
            }
            a--;
            System.out.println(" ");

        }

    }
}
