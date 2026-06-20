package _2D_Array;


import java.util.Scanner;

public class TransposeMatrix {
    static void main(String[] args) {
        /*
        we are changing the original matrix to transpose so this is valid
        for only square matrix

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of matris(square matrix so enter any one of row or column)");
        int n=sc.nextInt();

        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
           // System.out.println();
        }
        System.out.println("the matrix u have enterd");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        if i only
        arr[i][j]=arr[j][i]
        this will be wrong the element which are not accessed yet so they will be modified
        ex:1,4
        arr[1][4]=arr[4][1]
        later when it is accessed it may use the update

        mehtod 2:
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        this is also wrong because when we use
        swap for(2,3)->(3,2)
        and it is changed to original array when
        swap for (3,2)->(2,3)
        the array remained same from start

          SOLUTION:
                    use triangle pattern of the array swap them only
                    refer notes if u dont understand triangle pattern
         */
        System.out.println("Transpose of the enterd matrix");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
