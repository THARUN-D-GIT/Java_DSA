package TimeAndSpace_complexity;

public class Duplicate_Element_In_array {
    static void main(String[] args) {
        /*
        there is an array of size n+1
        and its element are there from 1 to n
        ti fill the extra one index 1 element is dupilcated
        find out that duplicate element

         */
        int [] arr={1,2,4,5,3,4};
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is:" +arr[i]);
                    break;

                }

            }
        }
        // Method 2 using extra array
        boolean [] flag=new boolean[n+1];
        for(int elem:arr){
            if(flag[elem]==true){
                System.out.println("Duplictae elemnt:"+elem);
                break;
            }
            else flag[elem]=true;
        }
        //Method 3 using sum
        int Arraysum=0;
        int sum=(n*(n-1))/2;
        for(int elem:arr){
            Arraysum+=elem;
        }
        System.out.println("Duplicate element is:"+(Arraysum-sum));
    }
}
