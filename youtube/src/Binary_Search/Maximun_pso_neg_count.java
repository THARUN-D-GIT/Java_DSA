package Binary_Search;

public class Maximun_pso_neg_count {
    static void main(String[] args) {
       int [] arr ={-5,-4,-3,-1,0,0,0,1,2,6,8,9,10};
       int n = arr.length;
       int poscnt=0,negcnt=0;
       for(int elem:arr){
           if(elem>0) poscnt++;
           else if(elem<0) negcnt++;
       }
        System.out.println("maximum count of neg and pos in the array is:");
       //which no have appeared more pos or neg
        System.out.println(Math.max(poscnt,negcnt));
        //using Binary search method
        System.out.println("using Binary search method");
        int lo=0,hi=n-1;
        int ps=0,ne=0;
        // Binary Search to count negative number
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=0){
                hi=mid-1;

            }
            else {
                lo=mid+1;

            }
        }
        ne=lo;
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=0){
               lo=mid+1;

            }
            else {
                hi=mid-1;

            }
        }
        ps=n-lo;

        System.out.println("maximum count of neg and pos in the array is:");
        System.out.println(Math.max(ps,ne));
    }
}
