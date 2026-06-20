package _2D_Array;

public class SnakePattern {
    static void main(String[] args) {
        int [] [] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int m=arr.length;
        int n=arr[0].length;
       // System.out.println(n);
        /*
        QUESTION:
                    print the element in such a order that
                    the output of the matrix should be

                    2,8,3,4,7
                    3,6,1,2,7
                    5,5,4,1,4
                    6,2,8,1,3
                    basically first row from 0 to n-1 column
                    2nd row from n-1 to 0
                    like this alternatively

         */
        for(int i=0;i<m;i++){
            if(i%2!=0){
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");

                }
                }

                else {
                    for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            System.out.println();
            }
        }
    }

