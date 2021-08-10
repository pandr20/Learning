package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Copenhagen");
        cityList.add("Oslo");
        cityList.add("Tokyo");
        cityList.add("Miami");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Copenhagen in the list? " + cityList.indexOf("Copenhagen"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2,"Stockholm");

        cityList.remove("Miami");

        cityList.remove(1);

        System.out.println(cityList.toString());

        // Display the contens in the list in reverse order
        for(int i = cityList.size() - 1; i >= 0; i--)
            System.out.println(cityList.get(i) + " ");
        System.out.println();

        // To create am array and using the ArrayList method

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.shuffle(list);
        System.out.println(list);



    }
}
