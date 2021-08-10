package Arrays;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {


        // ArrayList = a resizable array.
        //              Elements can be added and removed after compilation phase
        //              store reference data types


        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0,"sushi"); // Change index zero value
        food.remove(2); // Remove index 2
        food.clear(); // Clear the hole arraylist 

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));

        }
    }
}
