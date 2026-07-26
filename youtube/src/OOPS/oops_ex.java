package OOPS;

public class oops_ex {
    private static class cricketer
    {
        int jno;
        String name;
        int runs;
        cricketer(int jno,String name,int runs)
        {
            this.jno=jno;
            this.name=name;
            this.runs=runs;
        }
        void print()
        {
            System.out.println(jno+" "+name+" "+runs);
        }
    }

    static void main(String[] args) {
        cricketer c1=new cricketer( 18,"virat kholi",9300);
        c1.print();
        cricketer c2=new cricketer( 17,"A B Develiers",8300);
        c2.print();
        cricketer c3=c2; //Creates shallow copy means changes in c2will effect c1
        c3.runs=12500;
        c2.print();
        c3.print();
    }
}
