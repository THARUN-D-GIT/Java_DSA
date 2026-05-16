package Sort_algo;

import java.util.Scanner;

public class Bubble_sort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            //print(arr);
        }
        print(arr);
        System.out.println();

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }

    static void print(int [] arr) {
        for(int elem:arr){
            System.out.print(elem+" ");
        }

    }
}
