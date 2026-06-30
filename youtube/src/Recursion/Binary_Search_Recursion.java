package Recursion;

public class Binary_Search_Recursion {
    static void main(String[] args) {
        /*
        binary search using recursion
        return the index if the element exists
        else -1;

         */
        int [] arr={7,18,29,37,41,55,67,72,81,99,100};
        int target=100,lo=0,hi=arr.length-1;
        System.out.println("the element exists in index of the array:"+" "+binarySearch(arr,target,lo,hi));
    }
    public static int binarySearch(int [] arr,int target,int lo,int hi){
        //int low=0,high=arr.length-1;
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binarySearch( arr, target, lo, mid-1);
       else if (arr[mid]<target)return binarySearch( arr, target, mid+1,hi);
       return -1;
    }
}
