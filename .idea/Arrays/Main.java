package Arrays;

public class Main {

    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String [] cars = {"Camaro","Tesla","Corvette","BMW"};

        cars [0] = "Mustang";

        System.out.println(cars[3]);


        String[] cars1 = new String[4];

        cars1[0] = "Camaro";
        cars1[1] = "Tesla";
        cars1[2] = "Corvette";
        cars1[3] = "BMW";

        System.out.println(cars1[2]);

        for(int i=0; i<=cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
