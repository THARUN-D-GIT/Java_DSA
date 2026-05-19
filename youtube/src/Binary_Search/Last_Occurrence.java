package Binary_Search;

import java.util.Scanner;

public class Last_Occurrence {
    static void main(String[] args) {
        /*
        similar to first occurrence find the last index
        of the element appearing in the array
         */
        int [] arr={1, 3, 5, 5, 5, 5, 67, 123, 125};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target element:");
        int target = sc.nextInt();
        int n=arr.length;
        int low=0,high=n-1,idx=-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else{
                idx=mid;
                low=mid+1;
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("last occurrence is "+idx);

        }
        else System.out.println("target not found");
    }
}
