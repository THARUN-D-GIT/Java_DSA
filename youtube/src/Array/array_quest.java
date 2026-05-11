package Array;

public class array_quest {
    static void main(String[] args) {
        /*
        multiply odd indexed elements by 2
        and add 10 to even indexed elements

         */
        int arr[]={12,36,56,48,97,25};
        print(arr);
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
        }
        print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
