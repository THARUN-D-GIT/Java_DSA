package Binary_Search;

import java.util.Scanner;

public class Binary_search_descending {
    static void main(String[] args) {
        /*
        binary search for a array whose elements are sorted in descednding order

         */
        Scanner sc=new Scanner(System.in);
        int [] arr={25,19,15,14,7,2,-3};
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int low=0,high=arr.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else {
                System.out.println("target found at index:"+mid);
                flag=true;
                break;
            }
        }
        if(!flag) System.out.println("no target found");
    }

}
