package VariableScope;

import java.util.Random;

public class DiceRoller {

    //Random random; these will work if the roll() is empty or we can declare them inside the method, like the example
    //int number;

    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random,number);

    }

    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
