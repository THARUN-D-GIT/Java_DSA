package MERGE_SORT;

public class Missing_number {

    static void main(String[] args) {
        //missing number using cyclic sort
        int [] arr={1,5,4,3,6,7};
        int n=arr.length+1;
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]==n) i++;
            else{
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1){
            System.out.println("Missing number: "+(i+1));
            break;
        }

        }


    }
public static void swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
}
