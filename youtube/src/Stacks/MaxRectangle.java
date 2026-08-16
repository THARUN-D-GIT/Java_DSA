package Stacks;
import java.util.*;

public class MaxRectangle {
    static void main(String[] args) {
        /*
        Given a 2D binary matrix mat[][], where each cell contains either 0 or 1. Find the maximum area of a rectangle that can be formed using only 1's within the matrix.

Examples:

Input: mat[][] = [[0, 1, 1, 0], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 0, 0]]
Output: 8
Explanation: The largest rectangle of 1's highlighted in green, matching the area of 2 * 4 = 8.

Input: mat[][] = [[0, 1, 1], [1, 1, 1], [0, 1, 1]]
Output: 6
Explanation: The largest rectangle of 1's highlighted in green, matching the area of 3 * 2 = 6.

Constraints:
1 ≤ mat.size(), mat[i].size() ≤ 1000
0 ≤ mat[][] ≤ 1
         */
        int [][] arr={
                {0, 1, 1, 0},{1,1,1,1},{1, 1, 1, 1},{1, 1, 0, 0}
        };
        System.out.println(" ans f0r arr1 : "+maxArea(arr));
        int [][] arr2={
                {0, 1, 1},{1, 1, 1},{0, 1, 1}
        };
        System.out.println(" ans f0r arr2 : "+maxArea(arr2));

    }
    public static int maxArea(int mat[][]) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1) mat[i][j]+=mat[i-1][j];
            }
        }
        int max=0;
        for(int [] arr:mat)
        {
            int area= largestRectangleArea(arr);
            max=Math.max(area,max);
        }
        return max;

    }
    public static  int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int [] pse=new int[n];
        int [] nse=new int[n];
        nse[n-1]=n; // fr calculations purpose
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[i]<=arr[st.peek()]) st.pop();
            if(st.size()==0) nse[i]=n;
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        //empty stack to find pse
        while(st.size()>0) st.pop();
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && arr[i]<=arr[st.peek()]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int area=arr[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(maxArea,area);

        }
        return maxArea;
    }

}
