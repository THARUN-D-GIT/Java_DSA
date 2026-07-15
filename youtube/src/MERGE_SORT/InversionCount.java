package MERGE_SORT;

public class InversionCount {
    static int count;

   /* public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static long mergeSort(int[] arr, int lo, int hi) {

        if (lo >= hi)  hi
            return 0;

        int mid = lo + (hi - lo) / 2;

        long count = 0;

        count += mergeSort(arr, lo, mid);
        count += mergeSort(arr, mid + 1, hi);
        count += merge(arr, lo, mid, hi);

        return count;
    }

    static long merge(int[] arr, int lo, int mid, int hi) {

        int[] temp = new int[hi - lo + 1];

        int i = lo;
        int j = mid + 1;
        int k = 0;

        long count = 0;

        while (i <= mid && j <= hi) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= hi) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[lo + x] = temp[x];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 1};

        long ans = inversionCount(arr);

        System.out.println("Inversion Count = " + ans);
    }

    */
   static void main(String[] args) {
       int [] arr={4,2,9,7,8,5,3};
       count=0;
       for(int elem:arr)
           System.out.print(elem+" ");
       System.out.println();
       merge_sort(arr);
       for(int elem:arr)
           System.out.print(elem+" ");
       System.out.println("ineversion count for this array:"+count);

   }
   public static void merge_sort(int [] arr)
   {
       int n=arr.length;
       if(n==1) return;
       int [] a=new int[n/2];
       int [] b=new int[n-(n/2)];
       int idx=0;
       for(int i=0;i<a.length;i++){
           a[i]=arr[idx++];
       }
       for(int i=0;i<b.length;i++){
           b[i]=arr[idx++];
       }
       merge_sort(a);
       merge_sort(b);
       merger(a,b,arr);
   }
   public static void merger(int [] a,int [] b,int [] arr)
   {
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               arr[k++]=a[i++];
           }
           else {//if a[i]>b[j} the inversion exists for all next elements
               count+=(a.length-i);
           arr[k++] = b[j++];

           }

       }
       while(i<a.length){
           arr[k++]=a[i++];
       }
       while(j<b.length){
           arr[k++]=b[j++];
       }
   }

}
