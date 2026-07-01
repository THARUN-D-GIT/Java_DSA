package Binary_Search;

public class FirstOccurance_recursion {
    static void main(String[] args) {
        int [] arr={1,2,2,3,4,5};
        int idx=-1;
        int lo=0,hi=arr.length-1;
        int target=2;
        System.out.println("First Occurance of Binary Search");
        System.out.println(firstOccurance(arr,target,idx,lo,hi));

    }
    public static int firstOccurance(int[] arr,int target,int idx,int lo,int hi) {
//        hi=arr.length-1;
//        lo=0;
        if(lo>hi) return idx;
        int mid=lo+(hi-lo)/2;

        //if(arr[mid]==target) return idx;
         if(arr[mid]>target) return firstOccurance(arr,target,idx,lo,mid-1);
        else if(arr[mid]<target) return firstOccurance(arr,target,idx,mid+1,hi);
        else{
            idx=mid;
             return firstOccurance(arr,target,idx,lo,mid-1);
        }


    }
}
