package MERGE_SORT;

public class merge_sort {
    static void main(String[] args) {
        // code to merge 2 sorted array to another sorted array
        /*
        public static void merge(int []a,int[] b)
        {
        int i=0,j0,k=0;
        int [] k=new arr[a.length+b.length];
        while(i<=a.length && j<=b.length)
        {
        if(a[i]<=b[j] c[k++]=a[i++];
        else c[k++]=b[j++]
        }
        while(i<a.length) c[k++]=b[i++];
        while(j<b.lenght) c[k++]=b[j++];
        }
         */
        int [] arr={5,2,8,4,1,6,7,3};
        System.out.println("Array before sorting:");
        for(int elem:arr) System.out.print(elem+" ");
        merge(arr);
        System.out.println("Array after sorting:");
        for(int elem:arr) System.out.print(elem+" ");

    }
    public static void merge(int [] arr){
        //step 1create 2 arrays n/2,n-n/2;
        int n=arr.length;
        int [] a=new int [n/2];
        int [] b=new int [n-(n/2)];
        //step 2: copy paste arr into a and b
        int idx=0; // used to travel original array
        for(int i=0;i<a.length;i++) {
            a[i] = arr[idx];
            idx++;

        }
        for(int j=0;j<b.length;j++) {
            b[j]=arr[idx++];
        }
        //Step 3: use recursion to sort a and b array

        merge(a);
        merge(b);
        //Step 4:merge 2 sorted arrays

    }
    public static void merger(int []a,int[] b,int [] c)
    {
        int i=0,j0,k=0;
        //int [] k=new arr[a.length+b.length];
        while(i<=a.length && j<=b.length)
        {
            if(a[i]<=b[j] c[k++]=a[i++];
        else c[k++]=b[j++]
        }
        while(i<a.length) c[k++]=b[i++];
        while(j<b.lenght) c[k++]=b[j++];
    }
}
