package loops;

import java.util.Scanner;

public class GP {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the  number of terms in a gp");
        int n=sc.nextInt();
        for(int i=1;i<=Math.pow(2,n);i*=2)
        {
            System.out.println(i+" " );

        }

    }
}
