package Pattern_printing;

import java.util.Scanner;

public class alpha_star {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n");
        int n = sc.nextInt();
        /* char al=(char) n;
        for(int i=1;i<=al;i++){
            for(int j=1;j<=al;j++){
                System.out.print(al+" ");
            }
        }
        wrong
        we have to use first we will add 64 to j and then type cast to
        CHARACTER
*/
        for (int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++){
            System.out.print((char) (j+64)+" ");
        }
        System.out.println(" ");
    }
        System.out.println("===============");
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                System.out.print((char) (j+96)+" ");
            }
            System.out.println(" ");
        }

}
}
