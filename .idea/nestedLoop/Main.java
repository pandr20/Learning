package nestedLoop;

import java.util.Scanner;

public class Main {

    // Make variables for each row, colum, symbol. Giv message to user, make them enter the value, make for loop with for loop inside
    // nested loops = a loop inside of a loop

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of colums: ");
        colums = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=colums; j++) {
                System.out.print(symbol);
            }
        }
    }





}
