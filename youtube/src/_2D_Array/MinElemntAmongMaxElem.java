package _2D_Array;

public class MinElemntAmongMaxElem {
    static void main(String[] args) {
        /*
        find the minimum element among the maximum element of each row
        ex:
        2,8,3,4,7 ->8
        7,2,1,6,3 ->7
        5,5,4,1,4 ->5
        3,1,8,2,6 ->8


        8,7,5,8 are the max element of each row now return the minimum
        element among them
        ans:5

         */
        int [][] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int m=arr.length;
        int n=arr[0].length;
        int minelem=Integer.MAX_VALUE;
        int maxelem=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int celement=arr[i][j];
                if(celement>maxelem)
                    maxelem=celement;
            }
            if(minelem>maxelem){
                minelem=maxelem;
            }
            maxelem=Integer.MIN_VALUE;
        }
        System.out.println(minelem);
    }
}
