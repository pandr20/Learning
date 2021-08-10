package Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException {

        Scanner scanner = new Scanner(System.in);


        File file = new File("src/Lights - Patrick Patrikios.wav");
        AudioInputStream audistream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audistream);

        String response = "";


        while(!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.println("Enter you choice");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Byeee");

        clip.start();

    }
}
