package Recursion;

public class Array_Print_recursion {
    static void main(String[] args) {
        /*
        print the array elements using recursion
         */
        int [] arr={1,4,5,6,7,5,3,4,5,9};
        int idx=0;
        System.out.println("elements of the array:");
       RecPrint(arr,idx);
    }
    public static void RecPrint(int [] arr,int idx){
        if (idx==arr.length) return;
//        System.out.print(arr[idx]+" ");
//        RecPrint(arr,idx+1);
        // for reverse print
//        RecPrint(arr,idx+1);
//        System.out.print(arr[idx]+" ");
    }
}
