package lec_1;

import java.util.Scanner;

public class binary_counters
{
    static void main(String[] args) {
        int n,c0=0,c1=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        n=sc.nextInt();
        while(n>0){
            if(n%2==0)
                c0++;
            else
                c1++;
n=n/2;
        }
        System.out.println("The number fo zeros is:"+c0);
        System.out.println("the number of 1s  is :"+c1);

    }
}
