package Array;

import java.util.Scanner;

public class Array_sum {
    static void main(String[] args) {
        // Print  sum of elements of array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int product=1;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println("sum of elements is:"+sum);
        System.out.println("product is:"+product);
    }
}
