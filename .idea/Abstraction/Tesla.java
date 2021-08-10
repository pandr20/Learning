package Abstraction;

public class Tesla extends Vehicle{
    String name;
    public Tesla (String name) {
       // super(); Call a super class constructor in this instance the vehicle class constructor
       String TeslaName = this.name;

        System.out.println("The name of the car is " + name );

    }



    @Override
    void go() {
        System.out.println("The driver is driving the car");

    }
}
