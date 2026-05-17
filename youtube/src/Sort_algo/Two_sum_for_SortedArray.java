package Sort_algo;

import java.util.Arrays;
import java.util.Scanner;

public class Two_sum_for_SortedArray {
    static void main(String[] args) {
        /*
        using rwo pointer technique for sorted array
        if the sum>target
        decrease j
        else increase i
         */
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

         */
        int [] arr={1,5,4,7,9,6,2};
        int n=arr.length;
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int i=0,j=n-1;
       // int sum=0;
        boolean flag=false;
        Arrays.sort(arr);
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println(" ");
        while(i<j) {
            int sum = arr[i] + arr[j];
            if (sum > target) j--;
            else if (sum < target) i++;
            else {
                System.out.println("Target found at index:" + i + " " + j);
                flag = true;
                break;
            }
        }
            if(!flag){
                System.out.println("Target not found");
            }

    }
}
