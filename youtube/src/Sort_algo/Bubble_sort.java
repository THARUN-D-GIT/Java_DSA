package Sort_algo;

import java.util.Scanner;

public class Bubble_sort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            //print(arr);
        }
        print(arr);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
