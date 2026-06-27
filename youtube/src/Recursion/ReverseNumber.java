package Recursion;

public class ReverseNumber {
    static void main(String[] args) {
        int n=10;
        //int r=0;
        System.out.println(n);
//        while(n>0){
//            r*=10;
//            r+=n%10;
//            n=n/10;
//        }

        System.out.println(reverse(n,0));

    }
    public static int reverse(int n,int r) {
        if(n==0){

            return r;
        }
//        r*=10;
//        r+=(n%10);

        return reverse(n/10,r*10+n%10);
    }
}
