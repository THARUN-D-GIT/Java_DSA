package Sort_algo;

public class Kth_largest_element_in_array {
    static void main(String[] args) {
        /*
Given an array arr[] and a number k. The task is to find the kth largest element in the array.

Examples:

Input: arr[] = [3, 5, 4, 2, 9], k = 3
Output: 4
Explanation: Third largest element in the array is 4.
Input: arr[] = [4, 3, 7, 6, 5], k = 5
Output: 3
Explanation: Fifth largest element in the array is 3.
Constraints:
1 <= k <= arr.size<= 106
-104 <= arr[i] <= 104


         */
        int [] a={3, 5, 4, 2, 9};
        int k=3;
        for(int i=0;i<a.length;i++){
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=i;j<a.length;j++){


            if(a[j]<min) {
                min = a[j];
                idx=j;
            }
            }
            int temp=a[idx];
            a[idx]=a[i];
            a[i]=temp;
        }
        System.out.println("Kth largest element is: "+a[a.length-k]);
        /*
        this method is also correct but we can optimise it nlogn
        time complexity  so for that we can use Arrays.sort or
        wait until the all the sorting algorithm concept are done
         */
    }
}
