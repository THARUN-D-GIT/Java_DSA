package Array;

public class segregate_0s_1s_2s {
    static void main(String[] args) {
        int n0=0,n1=0;
        //,n2=0;
        int arr[] ={1,2,0,2,0,1,2,0,1,2,0,1,2,0,1};
        int n=arr.length;
        System.out.println(n);
        for(int elem:arr) System.out.print(elem+" ");
        System.out.println(" ");
        for(int i=0;i<n;i++){
            if(arr[i]==0) n0++;
            if(arr[i]==1) n1++;
           // if(arr[i]==2) n2++;
        }
        for(int i=0;i<n0;i++) arr[i]=0;
        for(int i=n0;i<n0+n1;i++) arr[i]=1;
        for(int i=n1+n0;i<n;i++) arr[i]=2;
        for(int elem:arr) System.out.print(elem+" ");
        System.out.println(" ");
    }
}
