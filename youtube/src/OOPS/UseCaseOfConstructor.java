package OOPS;

public class UseCaseOfConstructor {
    public static class studentData{
        String name;
        int rno;
        int [] marks;
        studentData( int s)
        {
            marks=new int[s];
        }
        void print()
        {
            System.out.println(name+"  "+rno);
            for(int i=0;i<marks.length;i++)
            {
                System.out.print(marks[i]+"  ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        studentData s1=new studentData(2);
        studentData s2=new studentData(4);
        s1.marks[0]=93;  s1.marks[1]=94;
        s2.marks[0]=88;  s2.marks[1]=78; s2.marks[2]=87;  s2.marks[3]=98;
        s1.name="tarun";
        s2.name="jnanedra";
        s1.rno=100;
        s2.rno=45;
        s1.print();
        s2.print();

        // even arrays also can be passed using the this way instead of setting size set the array


    }
}
