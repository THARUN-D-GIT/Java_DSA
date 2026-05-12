package Array;

import java.util.Scanner;

public class Rotate_array {
    /*
    rotating the array by given positive integer d
    means moving element to left by d number
    1,2,4,5,6,7
    d=3
    5,6,7,1,2,4
    means simply moving the starting d number element in array
    to end
     */
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={ 1,25,6,4,2,3};
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println("enter the rotate value(d):");
        int d=sc.nextInt();
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int elem:arr){
            System.out.print(elem+" ");
        }


    }
    public static void reverse(int[] arr,int i,int j){
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
