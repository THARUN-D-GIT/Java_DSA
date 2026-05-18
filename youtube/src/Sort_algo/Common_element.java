package Sort_algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Common_element {
    static void main(String[] args) {
        /*
        Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.

Example:

Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
Output: 2 2 3
Explanation: The common elements in sorted order are [2, 2, 3]
Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: 3 7 9
Explanation: The common elements in sorted order are [3, 7, 9]
Constraints:

1 ≤ a.size(), b.size() ≤ 105
1 ≤ a[i], b[i] ≤ 105
         */
        ArrayList<Integer> list = new ArrayList<>();
        int [] a={3, 4, 2, 2, 4};
        int [] b={3, 2, 2, 7};
       /* for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    list.add(b[j]);
                    b[j]=-1;
                    break;
                }
            }
        }
        Optimmised version

        */
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j])
            {
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
