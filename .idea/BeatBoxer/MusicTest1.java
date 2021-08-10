package BeatBoxer;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {

        try { // Try's the risky code
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch (MidiUnavailableException e) { // Catches the code if it fails
            System.out.println("Bummer");
        }


    } // close play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
