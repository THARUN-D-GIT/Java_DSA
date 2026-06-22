package _2D_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    static void main(String[] args) {
        /*
        Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of pascalTriangle");
        int n=sc.nextInt();
        System.out.println(getRow(n));
    }
    public  static List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++)
        {
            arr.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0||j==i) arr.get(i).add(1);

                else{
                    int elem=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).add(elem);
                }
            }
        }

        return arr.get(rowIndex);

    }
}
