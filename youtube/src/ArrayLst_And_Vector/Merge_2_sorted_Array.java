package ArrayLst_And_Vector;

public class Merge_2_sorted_Array {
    static void main(String[] args) {
        int [] arr={1,3,5,7};
        int [] arr2={4,6,7,9};
        int n=arr.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;
        int [] arr3=new int[n+n2];
        System.out.println(" ");
        for(int elem:arr){
            System.out.print(elem+" ");
        }System.out.println(" ");
        for(int elem:arr2){
            System.out.print(elem+" ");
        }
        while(i<n && j<n2){
            if(arr[i]<arr2[j]){
                arr3[k++]=arr[i++];
                //i++;
               // k++;
            }
            else{
                arr3[k++]=arr2[j++];

                //k++;
                //j++;
            }
            //k++;

        }

        if(i==n){
            while(j<n2){
                arr3[k++]=arr2[j++];
            }
        }
        else{
            while(i<n){
                arr3[k++]=arr[i++];

            }
        }
        System.out.println(" ");
        for(int elem:arr3){
            System.out.print(elem+" ");
        }


    }
}
