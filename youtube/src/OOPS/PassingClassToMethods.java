package OOPS;

public class PassingClassToMethods {
    public static class car{
        int model;
        String name;
        double length;
        String seat;

        //Method inside class
        void print()
        {
            System.out.println(model+" "+name+" "+length+" "+seat);
        }
    }
    static void main(String[] args) {
        car c=new car();
        c.length=3.33;
        c.name="kia carneas";
        c.model=2026;
        c.seat="7";
        change(c); //pass by reference
        System.out.println(c.model);
        c.print();


    }
    public static void change(car c){
        c.model=2025;
    }
}
