package OOPS;

public class Inheritance {
    public static class Pokemon
    {
        int power;
        String type;
        Pokemon(int power,String type)
        {
            this.power=power;
            this.type=type;
        }
        Pokemon() {}
        void print()
        {
            System.out.println(this.power+" "+this.type);
        }
    }
   static class LegendryPokemon extends Pokemon
    {
        String ability;
        //contains power,type,ability
        LegendryPokemon(){}
        LegendryPokemon(int power,String type,String ability)
        {
            super();
            this.ability=ability;
        }
        void print()
        {
            System.out.println(this.power+" "+this.type+" "+this.ability);
        }
    }
    static class strongpokemon extends Pokemon
    {
        int speed;
        //contains power,type,speed\
        strongpokemon(){}
        strongpokemon(int power,String type,int speed)
        {
            super();
            this.speed=10;
        }
        void print()
        {
            System.out.println(this.power+" "+this.type+" "+this.speed);
        }
    }
    static class godpokemon extends LegendryPokemon{
        char tag;
        //contains power,type,ability,tag
        godpokemon(){}
        godpokemon( int power,String type,String ability,char tag)
        {

            super();
            this.tag='A';
        }
        void print()
        {
            System.out.println(this.power+" "+this.type+" "+this.ability+" "+this.tag);
        }
    }
    static void main(String[] args) {
    Pokemon p1=new Pokemon(98,"Pokemon 1");
    p1.print();
        LegendryPokemon l1=new LegendryPokemon();
        l1.ability="Pressure";
        Pokemon pikachu=new Pokemon(99,"Pikachu");

    }
}
