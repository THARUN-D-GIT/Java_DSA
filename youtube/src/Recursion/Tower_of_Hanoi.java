package Recursion;

public class Tower_of_Hanoi {
    public static int count=0;
    static void main(String[] args) {
        /*
        moving all the disc from tower A ->Tower c
        using intermediate tower (Tower B)

        Tower A  ->  Tower B  ->   Tower C

        RULES:
                 1.Only one move is allowed at a time
                 2.in all scenarios the values of top most should be less than the next one from below
                 3.no disc at intermediate tower at last
                 4.Number of moves should be
                 2^n-1f

                 */
        /*
        ALGORITHM:
                    1.move n-1 disc rom A to B via c
                    2.move the largest disc from A to C
                    3.move n-1 disc from B->c via A
         */
        hanoi(5,'A','B','C');
        System.out.println("total number of steps are: "+count);
    }
    public static void hanoi(int n,char src,char help,char dest)
    {
        if(n==0) return;
        // here we are using src->A help->B,dest->C
        //n-1 disc from A ->B
        hanoi(n-1,src,dest,help);
       // move the largest disc from A to C
        System.out.println(n+"->"+src+"->"+dest);
        count++;
        //move n-1 disc from B->c via A
        hanoi(n-1,help,src,dest);
    }
}
