package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextInputStreamExercise {

    public static void main(String[] args) {

        String fileName = "dobedo.txt";
        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\nconstains the following lines:\n ");

        try {
            inputStream = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);

            System.exit(0);
        }

        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }
}
