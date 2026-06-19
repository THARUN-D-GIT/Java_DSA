package _2D_Array;

public class RowWithMaxSum {
    static void main(String[] args) {
        /*
        find the row with maximum sum
        for ex:
        1 2 3 4 ->10
        3 5 7 8 ->23
        4 7 9 4 ->24
        return the row number which has maximum sum
         */
        int [][] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int [][] arr2={{1,2,3,4},{3,5,7,8},{4,7,9,4}};
        int m=arr2.length;
        int n=arr2[0].length;
        int maxsum=0;
        int sum=0,k=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               // int sum=arr[i][j];
                sum+=arr2[i][j];
            }
            if(maxsum<sum) {maxsum=sum;
                k=i;}
            sum=0;
        }
        System.out.println("row with maximum sum:"+k+" the sum:"+maxsum);
    }
}
