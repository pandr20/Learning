package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInputDemo2 {

    public static void main(String[] args) {

        System.out.println("Enter the file name");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.next();
        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\n" + "contains the following lines:\n");

        try {
            inputStream = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found " + fileName);

            System.exit(0);
        }
        while(inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }
}
