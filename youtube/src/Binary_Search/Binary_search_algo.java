package Binary_Search;

import java.util.Scanner;

public class Binary_search_algo {
    static void main(String[] args) {
        //condition is array should be sorted;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target  element");
        int target = sc.nextInt();
        for (int elem:arr) System.out.print(elem+" ");
        System.out.println();
        int low=0,high=n-1;
        boolean flag=false;
        while(low<=high){
            int  mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else {System.out.println("Target found at index"+mid);
                flag=true;
            break;
            }
        }
        if(flag==false) System.out.println("Target not found");
        }

    }

