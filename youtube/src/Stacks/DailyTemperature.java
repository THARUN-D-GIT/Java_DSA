package Stacks;
import java.util.*;
public class DailyTemperature {
    static void main(String[] args) {
        /*
        LC-739
        Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.



Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]


Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100

         */
        int [] arr={73,74,75,71,69,72,76,73};
        print(arr);
        System.out.println("ans for arr");
        print(dailyTemperatures(arr));
        int [] arr2={30,40,50,60};
        print(arr2);
        System.out.println("ans for arr2");
        print(dailyTemperatures(arr2));
        int [] arr3={30,60,90};
        print(arr3);
        System.out.println("ans for arr3");
        print(dailyTemperatures(arr3));


    }
    public static int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        ans[n-1]=0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && temp[i]>=temp[st.peek()]) st.pop();
            if(st.size()==0) ans[i]=0;
            else ans[i]=st.peek()-i;
            st.push(i);

        }
        return ans;
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
