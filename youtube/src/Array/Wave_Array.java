package Array;

public class Wave_Array {
    static void main(String[] args) {
        /*
        to arrange the array in such a way that
        here index number of array are referring
        1>=2<=3>=4<=5 so on (note the given array will be sorted)
        example
        1,2,3,4,5
        o/p:2,1,4,3,5

         */
        int arr[]={2,4,7,8,9,10};
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        int n=arr.length;
        int i=0,j=1;
        while(i<n && j<n){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
        System.out.println(" ");
        for(int elem:arr){
            System.out.print(elem+" ");
        }

    }
}
