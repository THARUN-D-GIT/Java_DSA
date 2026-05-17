package Sort_algo;

import java.util.Scanner;

public class move_0s_toEnd {
    static void main(String[] args) {
        /*
        moving all zeros in an array to the end without changing the order of other elements
        ex:
        {1,-1,0,2,4,0,0,0,9,8,7,0}
        o/p:
        {1,-1,2,4,9,8,7,0,0,0,0,0}

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();
      /*for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]==0){
                    int  temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

       */



       /* for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        Optimised  version uses sliding window concept
        2 pointer techniques both  are at starting index only

        */
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;

            }

        }
        print(arr);
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
