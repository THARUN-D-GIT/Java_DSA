package Recursion;

public class ArrayTargetElem_Recursion {
    static void main(String[] args) {
        /*
        tell whether the element exists in an array or  not using recursion
        if yes return true
        else false
         */
        int [] arr={98,94,67,58,54,43};
        int elem=7;
        int idx=0;
        System.out.println(search(arr,elem,idx));
    }
    public static boolean search(int[] arr,int target,int idx){
        //int idx=0;
        if(idx==arr.length) return false;
        else if(arr[idx]==target) return true;
        //idx++;
       return  search(arr,target,idx+1);

    }
}
