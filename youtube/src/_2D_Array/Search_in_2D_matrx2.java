package _2D_Array;

import java.util.Scanner;

public class Search_in_2D_matrx2 {
    static void main(String[] args) {
        /*
        Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109
         */
        int [][] arr= {{1,4,6},{2,6,5},{5,9,8}};
        System.out.println("enter the target element from this array");
        Scanner sc=new Scanner(System.in);
        int target =sc.nextInt();
        System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]>target) j--;
            else if(arr[i][j]<target) i++;
            else return true;
        }
        return false;
    }
}
