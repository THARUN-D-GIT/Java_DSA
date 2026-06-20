package _2D_Array;

public class SnakePatternColumnWise {
    static void main(String[] args) {
        /*
        same as previous one now do it column wise
        o/p;
                2 7 5 3
                1 5 2 8
                3 1 4 8
                2 1 6 4
                7 3 4 6



         */
        int [] [] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
