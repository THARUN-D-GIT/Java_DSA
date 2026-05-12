package Array;

import java.util.Scanner;

public class reversing_partOfArray {
    static void main(String[] args) {
        int [] arr={11,14,12,25,34,89,67,65};
        int n =arr.length;
        System.out.println(n);
        System.out.println("original array:");
        for(int elem:arr ){
            System.out.print(elem+" ");
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index u have to swap(note i shoukd be grater than =0 and j should not exceed n)");
        int i=sc.nextInt();
        int j=sc.nextInt();

        //int i=0,j=n-1,
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println("reversed array:");
        for(int elem:arr ){
            System.out.print(elem+" ");
        }

    }
}
