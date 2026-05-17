package Sort_algo;

import java.util.Scanner;

public class Selction_sort_large_first {
    static void main(String[] args) {
        /* find the largest element then swap it  with last index

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=n-1;i>=0;i--){
            int max=Integer.MIN_VALUE;
            int idx=-1;
            for(int j=0;j<=i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    idx=j;
                }

            }
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
