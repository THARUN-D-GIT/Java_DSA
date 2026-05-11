package Array;

import java.util.Arrays;

public class Array_sort_inbuilt {
    static void main(String[] args) {
        int [] arr={1,-8,7,9,6,4};
        print(arr);
        Arrays.sort(arr);
        System.out.println(" ");
        print(arr);
    }
    public static void print(int [] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
