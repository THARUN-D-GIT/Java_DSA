package Array;
import java.util.ArrayList;

public class MedianOfTwoSortedArray_LC4 {
    static void main(String[] args) {
        /*
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
         */
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        int n=num1.length;
        int n2=num2.length;
        int i=0,j=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(i<n && j<n2){
            if(num1[i]<num2[j]){
                a.add(num1[i]);
                i++;
            }
            else if(num1[i]>num2[j]){
                a.add(num2[j]);
                j++;
            }
            else
            {
                a.add(num1[i]);
                a.add(num2[j]);
                i++;
                j++;
            }

        }
        while(i==n && j<n2){
            a.add(num2[j]);
            j++;
        }
        while(j==n2 && i<n) {
            a.add(num1[i]);
            i++;
        }

        Integer[] arr=a.toArray(new Integer[0]);
        // int [] arr=a.toArray();
        int n1=arr.length;
        int lo=0,hi=n1-1;
        int mid=lo+(hi-lo)/2;
        double median;
        if(n1%2==0)
        {
            median=(double)((arr[mid]+arr[mid+1])/2.0);

        }
        else median=(double)arr[mid];
        return median;

    }
}
