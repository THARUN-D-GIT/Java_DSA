package OOPS;
class Student {
    String name;
    private int rno;    // if values are set at start then they are default values for all instances of class
    double cgpa;
    private   void print()
    {
        System.out.println(name+" "+cgpa+" "+rno);
    }
    public void print2() // getter
    {
        //System.out.println(name+" "+cgpa+" "+rno);
        print();
    }
    //getter and setter
    /*
    getter is used to get the data from private class or variable
    setter :used to modify the private attribute
     */
    int  getrno()
    {
       return rno;
    }
    void setrno( int x)
    {
        rno=x;
    }
}

public class AccessModifier {

    static void main(String[] args) {
        Student s = new Student();
        s.cgpa = 4.5;
        s.name = "tarun";
        // s.rno cant access the private variable or methods in different class
        /*
        and private class in different file cant be accessed in different file in
        same package

        EX: we cant access student class method which is print and its modifier is private
        but
        we can access print2 because its access modifier is public

        DEFAULT VALUES:
        WHEN NOT DECLARED FOR
        INT=0,STRING=NULL

         */
        System.out.println(s.getrno());
        s.setrno(45);
        s.print2();

    }
}
