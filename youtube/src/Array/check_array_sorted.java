package Array;

public class check_array_sorted {
    static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int  j=0;j<arr.length;j++){
            if(arr[i]<=arr[j]){
                flag=true;
            }
        }}
        if(!flag){
            System.out.println("array is not sorted");
        }
        else {
            System.out.println("sorted array");
        }
    }
}
