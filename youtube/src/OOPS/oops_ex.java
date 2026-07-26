package OOPS;

public class oops_ex {
    private static class cricketer
    {
        int jno;
        String name;
        int runs;
       // final String country="India";
        static String country="NZ";
        cricketer(int jno,String name,int runs)
        {
            this.jno=jno;
            this.name=name;
            this.runs=runs;
        }
        void print()
        {
            System.out.println(jno+" "+name+" "+runs+" "+country);
        }
    }

    static void main(String[] args) {
        cricketer c1=new cricketer( 18,"virat kholi",9300);
        c1.print();
        cricketer c2=new cricketer( 17,"A B Develiers",8300);
        c2.print();
       // c2.country="england"; gives error because we can not update final keyword
        cricketer c3=c2; //Creates shallow copy means changes in c2will effect c1
        c3.runs=12500;
        c2.print();
        c3.print();

        final int x=23;
        c1.country="India"; //all players country will be India now
       // c2.country="NZ"; // all players country will be NZ now
        c1.print();
        c2.print();
         // x=26; gives error because the values can not be changes



        // FINAL KEYWORD AND STATIC KEYWORD
        /*
        final:variables values which cannot be edited
        static:
        variables which can be shared between classes and methods
         */
        print();
       //  print2();  error because the method is not static and can not be shared
    }
    public static void print()
    {
        System.out.println("hello world");

    }
    public  void print2()
    {
        System.out.println("hello world");
    }
}
