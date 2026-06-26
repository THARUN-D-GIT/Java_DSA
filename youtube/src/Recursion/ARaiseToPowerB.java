package Recursion;

import java.util.Scanner;

public class ARaiseToPowerB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a=sc.nextInt();
        System.out.println("enter exponent");
        int b=sc.nextInt();
        System.out.println(a+" raised to power "+b+" is");
        System.out.println(power(a,b));

    }
    public static int power(int a,int b){
//        if(b==0) return 1;
//        return a*power(a,b-1);
        /*method 2: solving using log space complexity ex:2^64=2^32*2^32 like similar
        but we cant write 2^5=2^(5/2)* 2(5/2) so
        for even exponent = a^b=a^(b/2)* a^(b/2)
        for odd:a^b=a^(b/2)* a^(b/2)*a

         */
        if(b==0) return 1;
//        if(b%2==0) return power(a,b/2)*power(a,b/2);
//        else return a*power(a,b/2)*power(a,b/2);
        //or
        int ans=power(a,b/2);
        if(b%2==0) return ans*ans;
        else return a*ans*ans;


    }
}
