package Array;

import java.util.Scanner;

public class ArrayBaiscs {
    static void main(String[] args) {
      //  int [] x={1,2,3,3,4,5};
        //Indexing and Accessing
       //System.out.println(x[5]);
       // Updating the value of the Array
        //x[3]=23;
        //System.out.println(x[3]);
    // Method 2 for initializing an Array
     /*   int [] arr=new int[7];
        arr[0]=1;
        arr[1]=12;
        arr[2]=14;
        arr[3]=17;
        arr[4]=17;
        arr[5]=13;
       arr[6]=12;
        System.out.println(arr.length);

      */
        Scanner sc=new Scanner(System.in);


       // System.out.println(arr[6]);
       /* for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        */
        //Taking array input
        int [] arr2=new int[8];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
