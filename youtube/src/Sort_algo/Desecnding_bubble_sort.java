package Sort_algo;

import java.util.Scanner;

public class Desecnding_bubble_sort {
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
        int swap=0;
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    break;
                }

            }
            if(flag) break;

            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }}
        print(arr);
        System.out.println();
        System.out.println(swap);
    }

    static void print(int [] arr) {
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
