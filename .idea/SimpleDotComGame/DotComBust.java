package SimpleDotComGame;

import java.util.ArrayList;

public class DotComBust {

    // Declare and initialize the variables we need
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArraylist = new ArrayList<DotCom>();
    private int numOfGuesses = 0;



    private void setUpGame() {
        // First make some dot coms and give them locations
        // Make three DotCom objects, give them names, and stick them in the ArrayList
        DotCom one = new DotCom();
        one.SetName("Pets.com");
        DotCom two = new DotCom();
        two.SetName("Tesla.com");
        DotCom three = new DotCom();
        three.SetName("Laptop.com");
        dotComArraylist.add(one);
        dotComArraylist.add(two);
        dotComArraylist.add(three);

        // Print brief instructions for the user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, Tesla.com, Laptop.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotcomToSet : dotComArraylist) { // call the setter method on this DotCom to five it hte location you just got from the helper
            ArrayList<String> newLocation = helper.placeDotCom(3); // Ask the helper for a DotCom location

        }
    }
        private void startPlaying() {
            while (!dotComArraylist.isEmpty()) {
                String userGuess = helper.getUserInput("Enter a guess");
                checkUserGuess(userGuess);
            }
            finishGame();// Call our own finishGame method
        }

        private void checkUserGuess(String userGuess) {
            numOfGuesses ++;
            String result = "Miss";

            for (DotCom dotComToTest : dotComArraylist) {
                result = dotComToTest.checkYourself(userGuess);
                if (result.equals("Hit")) {
                    break;
                }
                if (result.equals("Kill")) {
                    dotComArraylist.remove(dotComToTest);
                    break;
                }
            }
            System.out.println(result);
        }


        private void finishGame() {
            System.out.println("All dot coms are dead! Your stock is now worthless.");
            if (numOfGuesses <=18) {
                System.out.println("it only took your " + numOfGuesses + " guesses.");
                System.out.println(" You got out before your options sank.");
            } else {
                System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
                System.out.println("Fish are dancing with your options.");
            }


            }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
    }
















































    /*public static void main(String[] args) {

        int numOfGuesses = 0; // Make a variable to track how many guesses the user makes

        GameHelper helper = new GameHelper(); // this is a special class we wrote that has the method for getting user input for now, pretend it's part of java

SimpleDotCom theDotCom = new SimpleDotCom(); // Instantiate a SimpleDotCom object
        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locationsCells = {randomNum,randomNum+1,randomNum+2}; // make an int array for the location of the dot xom (3 consecutive int out of a possible 7)

        theDotCom.setLocationCells(locations); // Invoke the setter method on the dot com
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Enter a number");

            String result = theDotCom.checkYourself(guess); // Ask the dot com to check the guess; save the returned result in a string

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

        String userGuess = "2";

        String result = theDotCom.checkYourself(userGuess); // Invoke the checkYourself() method on the dot com object, and pass it the fake guess */






