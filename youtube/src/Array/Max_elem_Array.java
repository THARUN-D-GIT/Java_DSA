package Array;

import java.util.Scanner;

public class Max_elem_Array {
    static void main(String[] args) {
        // printing the max element an array
        Scanner sc=new Scanner(System.in);
        int [] arr ={1,25,16,29,15};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
    min=arr[i];
            }

        }
        System.out.println("max is:"+max);
        System.out.println("minimum element in an array:"+min);
    }
}
