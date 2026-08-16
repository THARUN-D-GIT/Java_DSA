package Stacks;
import java.util.*;

public class LargestRectangleInHistogram {
    static void main(String[] args) {
        /*
        LC-84
        Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.



Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4


Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
         */
        int [] arr={2,1,5,6,2,3};
        print(arr);
        System.out.println("ans for arr "+largestRectangleArea(arr));
        int [] arr2={5,3,6,2,5,4,1};
        print(arr2);
        System.out.println("ans for arr2 "+largestRectangleArea(arr2));
    }
    public static int largestRectangleArea(int[] arr) {
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
    public static void print(int [] arr)
    {
        for(int elem:arr)
        {
            System.out.print(elem+" ");
        }
        System.out.println();
    }

}
