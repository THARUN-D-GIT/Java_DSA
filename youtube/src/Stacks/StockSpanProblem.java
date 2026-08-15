package Stacks;
import java.util.*;

public class StockSpanProblem {
    static void main(String[] args) {
        /*
        The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days.

Given an array arr[] representing daily stock prices, the stock span for the i-th day is the number of consecutive days up to day i (including day i itself) for which the price of the stock is less than or equal to the price on day i. Return the span of stock prices for each day in the given sequence.

Examples:

Input: arr[] = [100, 80, 90, 120]
Output: [1, 1, 2, 4]
Explanation: Consider each day one by one:
Day 1 (100): Span = 1.
Day 2 (80): Span = 1 because the previous price (100) is greater than 80.
Day 3 (90): Span = 2 because 80 ≤ 90, but 100 > 90.
Day 4 (120): Span = 4 because 100, 80, and 90 are all less than or equal to 120.
Hence, the output is [1, 1, 2, 4].
Input: arr[] = [10, 4, 5, 90, 120, 80]
Output: [1, 1, 2, 4, 5, 1]
Explanation: Consider each day one by one:
Day 1 (10): Span = 1.
Day 2 (4): Span = 1 because the previous price (10) is greater than 4.
Day 3 (5): Span = 2 because 4 ≤ 5, but 10 > 5.
Day 4 (90): Span = 4 because 10, 4, and 5 are all less than or equal to 90.
Day 5 (120): Span = 5 because all previous prices are less than or equal to 120.
Day 6 (80): Span = 1 because the previous price (120) is greater than 80.
Hence, the output is [1, 1, 2, 4, 5, 1].
Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
         */

        int [] arr={100, 80, 90, 120};
        for(int elem:arr) System.out.print(elem+" ");
        System.out.println(calculateSpan(arr));

    }
    public  static class pair{
        int value;
        int idx;
        pair(int value,int idx)
        {
            this.value=value;
            this.idx=idx;
        }

    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        //METHOD 1
        // Stack<Integer> st=new Stack<>();
        // int n=arr.length;
        // int [] span=new int [n];

        // for(int i=0;i<n;i++)
        // {
        //     while(st.size()>0 && arr[st.peek()] <=arr[i] ) st.pop();
        //     if(st.size()==0) {
        //         span[i]=i+1;


        //     }
        //     else{
        //         span[i]=i-st.peek();

        //     }
        //      st.push(i);


        // }


        // ArrayList<Integer> ans=new ArrayList<>(n);
        // for(int i=0;i<n;i++)
        // {
        //     ans.add(span[i]);
        // }
        // return ans;


        //METHOD 2 USING VALUE PAIR CLASS
        int n=arr.length;
        int [] span=new int [n];
        span[0]=1;
        Stack<pair> st=new Stack<>();
        st.push(new pair(arr[0],0));
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && st.peek().value<=arr[i]) st.pop();
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek().idx;
            }
            st.push(new pair(arr[i],i));
        }
        ArrayList<Integer> ans=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            ans.add(span[i]);
        }
        return ans;

    }
}
