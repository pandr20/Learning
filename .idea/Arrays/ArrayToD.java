package Arrays;

public class ArrayToD {

    public static void main(String[] args) {

        // 2D array = an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Mustang";
        cars[1][0] = "Ranger";
        cars[1][1] = "F-150";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Lambo";
        cars[2][1] = "Tesla";
        cars[2][2] = "TeslaS";

        for(int i=0; i<cars.length; i++) {
            System.out.println();
        for (int j=0; j<cars[i].length; j++) {
            System.out.println(cars[i][j]+"");

        }
    }



    }
}
