package Array;

public class Neg_elem_Array {
    static void main(String[] args) {
        // given an Array ,print its negative elements only
        int [] arr={1,2,-3,4,-5,6,-2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                System.out.println(arr[i]);
        }
    }
}
