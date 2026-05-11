package Pattern_printing;

import java.util.Scanner;

public class plus_patt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%2!=0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==((n+1)/2)||j==((n+1)/2)){
                        System.out.print("*"+" ");
                    }
                    else System.out.print("  ");
                }
                System.out.println(" ");
            }
        }
        else{
            System.out.println("only odd numbers are allowed");
        }
    }

}
