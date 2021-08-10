package Abstraction;

public class Main {

    public static void main(String[] args) {

        // abstract =   abstract classes cannot be instantiated, but they can have a subclass
        //              abstract method are declared without an implementation

       // Vehicle vehicle = new Vehicle();

        Tesla tesla = new Tesla("Patrick");


        tesla.go();



    }
}
