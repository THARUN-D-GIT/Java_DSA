package Array;

public class Segregate_array {
    static void main(String[] args) {
        int [] arr={1,1,0,0,1,0,1,0,1,0};
        int n=arr.length;
        for(int elem:arr){
            System.out.print(elem+" ");
        } int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.println();
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
