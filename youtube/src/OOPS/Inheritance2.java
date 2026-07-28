package OOPS;
class vehicle{
    int wheels;
    int speed;
}
class powerVehicle extends vehicle{
    int engine;
}
class AirCrafts extends powerVehicle{
    int rotors;
}
public class Inheritance2 {
    static void main(String[] args) {
        vehicle c1=new powerVehicle();
        vehicle  a1=new AirCrafts();


    }
}
