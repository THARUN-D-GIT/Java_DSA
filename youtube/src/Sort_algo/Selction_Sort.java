package Sort_algo;

import java.util.Scanner;

public class Selction_Sort {
    static void main(String[] args) {
        /*
        Selection sort
        first find out the minimum element then swap it with first index
        element
        move the index further
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
       // int min=arr[0];
        for(int i=0;i<n;i++) {
            // for this min have to be initialised inside loop because min is find out for each pass
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
