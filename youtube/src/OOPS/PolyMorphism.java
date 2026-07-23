package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("dog barks");
        }

    }
    public static class cat{
        void speak(){
            System.out.println("cat meows");
        }
    }
    public static class lion {
        void speak(){
            System.out.println("lion roars");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("human talks");
        }
    }

    static void main(String[] args) {
        Dog d = new Dog();
        cat c = new cat();
        lion l = new lion();
        Human h = new Human();
        d.speak();
        c.speak();
        l.speak();
        h.speak();

    }
}
