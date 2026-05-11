package loops;

public class Digits {
    static void main(String[] args) {
        int n=234569;
        int digit=0;
        int sum=0;

        while(n>0){
            n/=10;
            digit++;

        }
        System.out.println(digit);
        // to print sum of digits
        int n1=3456;
        while(n1>0){
             int count=n1%10;
            sum+=count;
            n1/=10;
        }
        System.out.println(sum);

    }
}
