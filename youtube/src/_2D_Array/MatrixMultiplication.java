package _2D_Array;

public class MatrixMultiplication {
    static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2={{9,8,7},{6,5,4},{3,2,1}};
        print(arr);
        System.out.println("\n");
        print(arr2);
        System.out.println();

        int m1=arr.length;
        int n1=arr[0].length;
        int m2=arr2.length;
        int n2=arr2[0].length;
        int [][]c=new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                    c[i][j]+=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        print(c);

}
public static void print(int [][] arr)
{
    for(int [] elems:arr){
        for(int elem:elems){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}
}
