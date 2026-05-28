package Binary_Search;

import java.util.Scanner;

public class Search_in_sorted_matrix {
    static void main(String[] args) {
        /*
        given an 2D array which are sorted in both row wise and column wise
        find the target element in that array using time complexity
        O(log(mn))
        for ex array:
                1   6   12  27  32
                38  41  47  49  55
                67  68  75  76  81
                84  89  91  92  98
                target=49

         */

        Scanner sc = new Scanner(System.in);
        int [] []arr={
                {1,6,12,27,32},
                {38,41,47,49,55},
                {67,68,75,76,81},
                {84,89,91,92,98},
        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("enter  the target element :");
        int target=sc.nextInt();
        int m=arr.length;
        int n=arr[0].length;
        int lo=0,hi=(m*n)-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midrow=mid/n,midcol=mid%n;
            if(arr[midrow][midcol]==target){
                System.out.println((midrow+1)+" "+(midcol+1));
                break;
            }
            else if(arr[midrow][midcol]>target){
                hi=mid-1;
            }
            else lo=mid+1;

        }
    }
}
