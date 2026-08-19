package QUEUE;
import java.util.*;

public class FirstNegInwindowSizeK {
    static void main(String[] args) {
        /*
        Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window [-8, 2] First negative integer is -8.
Window [2, 3] No negative integers, output is 0.
Window [3, -6] First negative integer is -6.
Window [-6, 10] First negative integer is -6.
Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
Output: [-1, -1, -7, -15, -15, 0]
Explanation:
Window [12, -1, -7] First negative integer is -1.
Window [-1, -7, 8] First negative integer is -1.
Window [-7, 8, -15] First negative integer is -7.
Window [8, -15, 30] First negative integer is -15.
Window [-15, 30, 16] First negative integer is -15.
Window [30, 16, 28] No negative integers, output is 0.
Input: arr[] = [12, 1, 3, 5] , k = 3
Output: [0, 0]
Explanation:
Window [12, 1, 3] No negative integers, output is 0.
Window [1, 3, 5] No negative integers, output is 0.

Constraints:
1 <= arr.size() <= 106
-105 <= arr[i] <= 105
1 <= k <= arr.size()
         */
        int []  arr={-8, 2, 3, -6, 10};
        int k=2;
        System.out.println(firstNegInt(arr,k));
        int []  arr1={12, -1, -7, 8, -15, 30, 16, 28};
        int k1=3;
        System.out.println(firstNegInt(arr1,k1));

    }
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0) q.add(i);
        }
        //windows formation
        for(int i=0;i<n-k+1;i++)
        {
            // window will be from i->i+k-1
            while(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;

    }
}
