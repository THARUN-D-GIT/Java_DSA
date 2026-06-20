package _2D_Array;

public class RotateImage_Lc48 {
    static void main(String[] args) {
        int [][] arr={
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16},
        };
        for(int [] a:arr){
            for(int elem:a){
                System.out.print(elem+" ");
            }
            System.out.println("");
        }
        rotate(arr);
        System.out.println();
        for(int [] a:arr){
            for(int elem:a){
                System.out.print(elem+" ");
            }
            System.out.println("");
        }


    }
    public  static  void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int k=0;k<n;k++){
            int [] row=arr[k];
            int a=0,b=arr[0].length-1;

            while(a<b)
            {
                int temp=row[a];
                row[a]=row[b];
                row[b]=temp;
                a++;
                b--;
            }


        }
    }
}
