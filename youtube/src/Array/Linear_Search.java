package Array;

import java.util.Scanner;

public class Linear_Search {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element u wish to search");
        int ser=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ser){
                System.out.println("element exisits in index:"+i);
                flag=true;
               break;}

        }
        if(!flag){
            System.out.println("element not found");
        }
    }
}
