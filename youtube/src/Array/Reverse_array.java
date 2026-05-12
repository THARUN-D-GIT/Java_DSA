package Array;

public class Reverse_array {
    static void main(String[] args) {
        int [] arr={11,14,12,25,65};
        int n =arr.length;
        System.out.println(n);
        System.out.println("original array:");
        for(int elem:arr ){
            System.out.print(elem+" ");
        }

        int i=0,j=n-1,temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println("reversed array:");
        for(int elem:arr ){
            System.out.print(elem+" ");
        }

    }
}
