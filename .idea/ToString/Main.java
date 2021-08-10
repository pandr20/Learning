package ToString;

import OOP.Car;

public class Main {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly and explicitly

        Ride ride = new Ride();



        System.out.println(ride.toString()); // explicitly
        System.out.println(ride);            //implicitly

        // or

        //System.out.println(car);
    }
}
