package Sort_algo;

public class Kth_Smallest_element {
    static void main(String[] args) {
        /*
        Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.
Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ k ≤  arr.size()


         */
        int [] a={7, 10, 4, 3, 20, 15};
        int k=3;
        for(int i=0;i<k;i++){
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
        System.out.println("Kth smallest element is: "+a[k-1]);
        /*
        same as kth largest element this can be optimised to
        nlogn using inbuilt sorting or merge or heap sort
        
         */

    }
}
