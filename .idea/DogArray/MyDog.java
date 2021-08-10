package DogArray;

import MethodOver.Dog;

public class MyDog {
    private String name;
    public static void main(String[] args) {



        // Make a Dog objet and access it
        MyDog dog1 = new MyDog();
        dog1.bark();
        dog1.name = "bart";

        // Now make dog array

        MyDog[] DogArray = new MyDog[3];

        // And put some dog in it
        DogArray[0] = new MyDog();
        DogArray[1] = new MyDog();
        DogArray[2] = dog1;


        // Now access the Dogs using the array
        // References

        DogArray[0].name = "Fred";
        DogArray[1].name = "Patrick";



        // Hmmm what is DogArray[2] name?

        System.out.println("Dog number two's name is ");
        System.out.println(DogArray[2].name);

        // Now loop through the array
        // and tell all dogs to bark

        int x = 0;
        while(x< DogArray.length) {
            DogArray[x].bark();
            x = x + 1;

    }



    }


    private void bark() {
        System.out.println(name +" Ruff Ruff");
    }
}
