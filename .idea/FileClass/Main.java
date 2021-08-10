package FileClass;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        // file = An abstract representation of file and directory pathnames


        File file = new File("src/secret_message.txt");

        if(file.exists()) {
            System.out.println("That file exits! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}
