package loops;

import java.util.Scanner;

public class AP {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of terms u want to print in a ap");
        int n=sc.nextInt();
        int i;
        for( i=2 ;i<=3*n-1;i=i+=3)
        {
            System.out.println(i);
        }
        for( i=0;i<n;i++)
        {
            System.out.print(2+(i*3)+" ");
        }

}}
