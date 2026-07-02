package Recursion;

import java.util.Arrays;

public class ReverseArray_Recursion {
    static void main(String[] args) {
        /*
        print thr element of an array in reverse order using Recursion
         */
        int [] arr={11,14,12,25,65};
        for(int elem:arr)
            System.out.print(elem+" ");
        System.out.println();
        System.out.println("reversed array");
//        System.out.println(Arrays.toString(reverse(arr, 0, arr.length - 1)));
        arr=reverse(arr,0,arr.length-1);
        for(int elem:arr)
            System.out.print(elem+" ");
    }
    public static int[]  reverse(int [] arr,int i,int j){
//         i=0;
//         j=arr.length-1;
         if(i>j) return arr;
         else if (i<j){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
        }
         return reverse(arr,i+1,j-1);

    }
}
