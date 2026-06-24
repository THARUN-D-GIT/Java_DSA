package _2D_Array;

public class Spiral_Matrix {
    static void main(String[] args) {

        /*
        it is like covering the outer rectangle first and then inner rectangle
        ex;
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16

traversing
→ 1  2  3  4
↓             8
↓            12
↓ 13 14 15 16
←
↑ 9  5
final traversal order
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

         */

        int [][] arr={
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30}
        };
        int m=arr.length;
        int n=arr[0].length;
        int fr=0,lr=m-1,fc=0,lc=n-1;
        while(fr<=lr&&fc<=lc){
            // first row
            for(int j=fc;j<=lc;j++){
                System.out.print(arr[fr][j]+" ");
            }
            fr++;
            if(fr>lr || fc>lc) break;
            //last column
            for(int i=fr;i<=lr;i++){
                System.out.print(arr[i][lc]+" ");
            }
            lc--;
            if(fr>lr || fc>lc) break;
            //last row
            for(int j=lc;j>=fc;j--){
                System.out.print(arr[lr][j]+" ");
            } lr--;
            if(fr>lr || fc>lc) break;
            //first column downwords
            for(int i=lr;i>=fr;i--){
                System.out.print(arr[i][fc]+" ");
            }
            fc++;
        }

    }
}
