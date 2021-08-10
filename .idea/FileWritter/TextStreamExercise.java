package FileWritter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextStreamExercise {

    public static void main(String[] args) {
        String fileName = "dobedo.txt";

        PrintWriter textStream = null;

        try{
            textStream = new PrintWriter(new FileOutputStream(fileName,true));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening the file" + fileName);

            System.exit(0);
        }

        textStream.println("Learning is the ability to get better everyday ");
        textStream.close();
        System.out.println("The text has been written to " + fileName);
    }



}
