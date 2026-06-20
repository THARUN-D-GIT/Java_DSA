package _2D_Array;

public class ForEachLoop {
    static void main(String[] args) {
        int [] [] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int m=arr.length;
        int n=arr[0].length;

        //METHOD 1
        for(int i=0;i<m;i++) {
            for(int elem:arr[i]) {
                System.out.print(elem+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int [] a:arr)
        {
            for(int elem:a)
            {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
