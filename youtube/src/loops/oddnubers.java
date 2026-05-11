package loops;

public class oddnubers {
    static void main(String[] args) {
        // print all odd numbers from 1 to 100 that are divisible by 3
        for(int i=1;i<=100;i++){
            if(i%2!=0 && i%3==0){
                System.out.print(i+" ");
                // runs 100 times
            }
        }
        System.out.println("\n");
        for (int i=3;i<100;i+=3)
        {
            if(i%2!=0){
                System.out.print(i+" ");
                // runs 33 times
            }
        }
    }
}
