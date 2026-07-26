package OOPS;

public class This_Keyword {
    public static class car{
        int price;
        String name;
        car(int price,String name){
            this.price=price;  // price=price
            this.name=name;
        }
        void print()
        { int price=10;
            //this will print null value or the value assigned to price locally
            System.out.println(price+" "+name);
            System.out.println(this.name+" "+this.price);
        }
    }
    static void main(String[] args) {
        /*
        this:
               it is used to distinguish the variables of class and
               parameters passed to a method


               car(int price,String name){
            this.price=price;
            in this if we use price=price and name=name it prints the default values
            to distinguish this we can pass different parameters name like
           (int x,string s)  to distinguish instance variable and local variable iin a class and method
            this.name=name;
        }
         */
        car c=new car(1140000,"Lord Alto");
        c.print();

    }
}
