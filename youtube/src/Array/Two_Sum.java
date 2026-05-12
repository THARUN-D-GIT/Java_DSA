package Array;

import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        int [] arr={1,5,-8,15,25};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target number");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){

                if(arr[i]+arr[j]==target){
                    System.out.println("target found at index:"+i+" "+j);
                    System.out.println("value of array are:"+arr[i]+" "+arr[j]);
                    found =true;
                    break;
                }

            }
            //sum=0;
        }
if(!found){
    System.out.println("target not found");
}
    }
}
