package ArrayLst_And_Vector;
import java.util.ArrayList;
import java.util.Collections;

public class Adding_one {
    static void main(String[] args) {
        /*
         add 1 to the given array consider it as a whole string at once
         for referral
         if the array is 1,2,3,4
         o/p= 1,2,3,5
         9,9,9
         o/p:1,0,0,0
         constraints array every value should be between 0 to 9
         */
        ArrayList<Integer> ans=new ArrayList<>();
        int [] arr={9,9,9,9};
        int n=arr.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }
            else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1){
            ans.add(1);

        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
