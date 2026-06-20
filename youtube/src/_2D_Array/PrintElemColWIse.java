package _2D_Array;

public class PrintElemColWIse {
    static void main(String[] args) {
        int [] [] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        //
    }
}
