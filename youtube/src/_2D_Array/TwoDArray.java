package _2D_Array;

import java.util.Scanner;

public class TwoDArray {
    static void main(String[] args) {
        /*
        initialize the array similar to array but add extra dimension
        [] to create a new 2D array
        int [][] arr=new int[3][3]
        first we initialize this array all the values will be '0'
        2D ARRAY is the combination of 1D array
        for ex:
        arr={{1,2,3},{2,3,4},{3,4,5}}
        here 2D array is the combination of 3 1D array


        FINDING THE LENGTH OF 2D ARRAY:
        ->arr.length gives the length of the of rows
        ->to find the length of the column access the length of
        any individual array it gives the column number of a 2D array
        ->arr[0].length gives the length of 1st row of the array
        which is nothing but column length of 2D array


         */
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the eleemnts of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
            /*
            2QUESTIONS
            1.PRINT SUM OF ALL THE ELEMENTS OF THE ARRAY
            2.PRINT THE SUM OF INDIVIDUAL ROWS
             */
            int sum=0;
            int sum1=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    sum+=arr[i][j];
                    sum1+=arr[i][j];
                   // System.out.println("sum of"+i+"th Row elemnts:"+sum1);
                    //sum1=0;
                }
                System.out.println("sum of"+i+"th Row elemnts:"+sum1);
                sum1=0;
                System.out.println();

    }
            System.out.println("sum of all elements:"+sum);
}
}
