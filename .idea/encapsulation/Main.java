package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        //                 can be accessed only through methods (GETTERS & setters)
        //                 You should make attributes private if you don't have a reason to make them public/protected

        Bike bike = new Bike("Yamaha","Speed",2021);


        bike.setYear(2020);


        System.out.println(bike.getMake());
        System.out.println(bike.getYear());
        System.out.println(bike.getModel());
    }




}
