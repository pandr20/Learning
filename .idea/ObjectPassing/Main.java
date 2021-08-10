package ObjectPassing;

public class Main {

    public static void main(String[] args) {


        Garage garage = new Garage();

        MotorCar motorCar = new MotorCar("BMW");
        MotorCar motorCar1 = new MotorCar("Tesla");

        garage.park(motorCar);
        garage.park(motorCar1);
    }
}
