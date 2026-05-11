package Array;

import java.util.Arrays;

public class ShallowCopyAndDeepCopy {
    static void main(String[] args) {

        /*Shallow copy is a copy of the array that will be pointing to the same
    address as original array changes in copy will be effected
    in original array also
     */
        System.out.println("Demo for Shallow copy");
        int[] arr={21,25,26,54,47};
        int [] arr2={14,12,17,58,56};
        System.out.println("Original Array:"+arr[2]);
        int [] x=arr;
        x[2]=99;
        System.out.println("Original Array:"+x[2]);

        System.out.println("Deep copy");
        /*
        deep copy is a replica od the original array that creates a copy of
        the original array in different address that will not effect
        original array
        Syntax:
        import java .util.Arrays
        int [] x=Arrays.copyOf(array name,array length)
         */
        int [] y= Arrays.copyOf(arr2,arr2.length);
        System.out.println("Original Array:"+arr2[3]);
        System.out.println("deep copy:"+y[3]);
        y[3]=99;
        System.out.println("Original Array:"+arr2[3]);
        System.out.println("deep copy:"+y[3]);


}}
