package MERGE_SORT;

public class ReversePairs {
        static int count;
        static void main(String[] args) {
            int [] arr={2,4,3,5,1};
        System.out.println(reversePairs(arr));
    }
        //static int count;
        public static  int reversePairs(int[] nums) {
            count=0;
            merge_sort(nums);
            return count;

        }
        public static void inversion(int [] a,int [] b)
        {
            int i=0,j=0;
            while(i<a.length && j<b.length)
            {
                if((long)a[i]>(long) 2*b[j])
                    count+=(a.length-i);
                j++;
            }
            i++;
        }
        public static void merge_sort(int [] arr)
        {
            int n=arr.length;
            if(n<=1) return;
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
            inversion(a,b);
            merger(a,b,arr);
        }
        public static void merger(int [] a,int [] b,int [] arr)
        {
            int i=0,j=0,k=0;
            while(i<a.length && j<b.length){
                if(a[i]<=b[j]){
                    arr[k++]=a[i++];
                }
                else {//if a[i]>b[j} the inversion exists for all next elements
                    //for this also same as inversion count use one extra function to //caluclate reverse pair counts and then apply the condition
                    //    if(a[i]>2*b[j])
                    //        count+=(a.length-i);
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


