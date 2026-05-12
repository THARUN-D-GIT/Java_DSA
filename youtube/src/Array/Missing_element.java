package Array;

public class Missing_element {
    static void main(String[] args) {
        /*
        given a sequence of number from 1 to n
        there is a msiing number in the sequence find the misiing number
        ex:
        1,2,3,5
        o/p: 4
         */


        int arr[] ={1,2,3,5,6,7,8,9};
        int n=arr.length;
        int sum=0;
        sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        System.out.println("Missing Element: "+(sum-sum2));

    }
}
