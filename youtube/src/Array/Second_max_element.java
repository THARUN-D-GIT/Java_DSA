package Array;

public class Second_max_element {
    static void main(String[] args) {
        int [] arr ={1,25,16,29,15};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max elemnt is:"+max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){

                smax=arr[i];
            }

        }
        System.out.println("Second largets elemnt in an array :"+smax);
    }
}
