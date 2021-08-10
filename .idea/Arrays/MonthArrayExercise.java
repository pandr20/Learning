package Arrays;

import java.util.Scanner;

public class MonthArrayExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] months = {"Januar", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "december"};
        System.out.println("Enter a month number (1 to 12):");
        int monthNumber = input.nextInt();
        for( String e: months) {
            System.out.println(e);
        }
        System.out.println("The month is " + months[monthNumber - 1]);

        int x = 30;
        int [] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);
    }


}
