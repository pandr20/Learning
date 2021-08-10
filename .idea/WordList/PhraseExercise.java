package WordList;

public class PhraseExercise {

    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "awesome", "win-win", "web-based", "dynamic"};
        String[] wordListTwo = {"empowered", "Sticky", "oriented", "focused", "shared", "networked", "targeted"};
        String[] wordListThree = {"process", "solution", "architecture", "strategy", "Mission", "Learning"};

        // Find out how many words are in each line
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Now build a phrase

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print out the phrase
        System.out.println("What we need is a " + phrase);


    }

}
