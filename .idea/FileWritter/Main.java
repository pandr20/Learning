package FileWritter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("poem.txt");
        fileWriter.write("Roses are red \n violets are blu \n i am awesome");
        fileWriter.append("\n ( A poem by Patrick)");
        fileWriter.close();

    }
}
