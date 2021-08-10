package Inheritance;

public class Main {

    public static void main(String[] args) {

        // inheritance =    the process where one class acquires,
        //                  the attributes and methods of another.


        Cars cars = new Cars();

        cars.go();

        Bicycle bicycle = new Bicycle();

        bicycle.stop();

        System.out.println(cars.speed);
        System.out.println(bicycle.speed);

        System.out.println(cars.doors);
        System.out.println(bicycle.pedals);




    }
}
