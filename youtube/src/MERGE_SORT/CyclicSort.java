package MERGE_SORT;

import java.util.Arrays;

public class CyclicSort {
    /*
    only works when an array contains element from 0 to n-1 for n sized array
    steps:
    -> check the element at current index and if it is equal to idx i++
    else:
    -> fetch the value at idx and assign it to idx
    -> arr[idx] and arr[i]

     */
    static void main(String[] args) {
        int [] arr={7,5,6,4,8,3,2,1,0};
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        cycle_sort(arr);
        System.out.println("array after sorting");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();


    }

    public static void cycle_sort(int[] arr)
    {
        int n = arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]==i) i++;
            else
            {
                int idx=arr[i];
                swap(arr,i,idx);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
