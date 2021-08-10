package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {

        int[] myList = new int[10];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = i;
            System.out.println(myList[i]);
        }
        int[] yourList = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + yourList.length + " values; ");
        for (int i = 0; i < yourList.length; i++) {
            yourList[i] = input.nextInt();
            System.out.println(Arrays.toString(yourList));


        }
        int [] randomList = new int[20];

        for(int i = 0; i < randomList.length; i++) {
            randomList[i] = (int) (Math.random() * 100);
            System.out.print(randomList[i] + " ");
            java.util.Arrays.sort(randomList);
            System.out.println(Arrays.toString(randomList));
        }

    }

}
