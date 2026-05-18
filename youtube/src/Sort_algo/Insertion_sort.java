package Sort_algo;

public class Insertion_sort {
    static void main(String[] args) {
        /*
        insertion sort uses the concept of sorted and unsorted  part
        start i from j and j  from 1
        check if arr[j]<arr[j-1]
        if yes then swap it and decrease j for remaining part to be solved

         */
        int arr[] ={1,5,8,3,2,5,8,9,17,67,98};

        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int elem:arr)
            System.out.print(elem+" ");
    }
}
