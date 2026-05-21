package Binary_Search;

public class Single_among_doubles {
    static void main(String[] args) {
        /*
        Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice.

Examples:

Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once.
Input: arr[] = [5]
Output: 5
Input: arr[] = [1, 2, 2, 3, 3]
Output: 1
         */
        /*int[] arr = {
                1,1,
                2,2,
                3,3,
                4,4,
                5,5,
                6,6,
                7,7,
                8,
                9,9,
                10,10,
                11,11,
                12,12,
                13,13,
                14,14
        };

         */
        int[] arr = {1,1,2,2,3};
       // int[] arr = {1,1,2,3,3};
        //int[] arr = {-9,-9,-7,-7,-5,-5,-1,0,0,2,2};
        //int[] arr = {1,1,2,2,3,3,4,4,5,6,6};
        //int [] arr={7};
        //int[] arr = {1,2,2,3,3,4,4,5,5};
      //  int[] arr = {1,1,2,2,3,3,4,4,9};
        //int[] arr = {1,1,2,2,3,4,4,5,5,6,6};
       // int[] arr = {1,1,2,3,3,4,4,5,5};
        int n=arr.length;
        int elem=0;
        if(n==1) elem=arr[0];
       else  if(arr[0]!=arr[1]) elem= arr[0];
       else if (arr[n-1]!=arr[n-2]) elem= arr[n-1];
        else{
            int lo=0,hi=n-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
                elem = arr[mid];

            }
            int f=mid,s=mid;
            if(arr[mid]!=arr[mid-1]) s=mid+1;
            else f=mid-1;
            int leftcnt=f-lo;
            if(leftcnt%2==0) lo=s+1;
            else hi=f-1;

        }}
        System.out.println("unique element is: "+elem);
    }
}
