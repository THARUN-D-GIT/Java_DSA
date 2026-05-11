package Array;

public class PassByReference_Array {
    static void main(String[] args) {
        int arr[]={1,3,45,65,32};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);

    }
    public static int change(int [] y){
        y[2]=87;
        return 0;
    }
}
