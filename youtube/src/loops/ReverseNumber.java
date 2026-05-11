package loops;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int original=n;
        int digit,reverse=0;
        while(n>0){
             digit=n%10;
             reverse=reverse*10+digit;
             n/=10;
        }
        System.out.println(reverse);
        System.out.println(original+reverse);
    }
}
