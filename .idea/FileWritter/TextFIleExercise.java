package FileWritter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFIleExercise {

    public static void main(String[] args) {

        String fileName = "sam.txt";

        PrintWriter outputStream = null;

        try{
            //outputStream = new PrintWriter(fileName);
            outputStream = new PrintWriter(new FileOutputStream(fileName, true));

        }catch (FileNotFoundException e) {
            System.out.println("Error the file was not found" + fileName);

            System.exit(0);
        }

        outputStream.println("I am getting better at programming and i can pass my exams");

        outputStream.close();
        System.out.println("The text has been written to " + fileName);
    }
}
