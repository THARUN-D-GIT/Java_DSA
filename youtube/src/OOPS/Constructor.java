package OOPS;

public class Constructor {
    public static class car{
        int model;
        String name;
        double price;
          car()  {}  //default constructor
        car(int x,String y,double z) {
            model = x;
            name = y;
            price = z;
        }
         void print()
         {
             System.out.println(model+" "+name+" "+price);
         }
    }
    static void main(String[] args) {
        /*
        CONSTRUCTOR:
                    Special method having same name as class and no return type
                    used to set values while creating the object
                    ex:
                    Student s1= new student();
                    ():
                    passing the value like a method
         CONSTRUCTOR OVERLOADING:
                                constructor to be used will be decided by the number of parameters
                                passes while calling the method
         */
        car c=new car(2021,"bmw",2.1);
        c.print();
        c.price=11.15;
        c.print();
         // car c2=new car(); it will give error use default constructor to overcome it
        car c2=new car();
        c2.price=2.1;
        c2.model=2019;
        c2.name="Tesla";
        c2.print();

    }
}
