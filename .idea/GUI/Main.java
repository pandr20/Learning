package GUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
/*
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame tiltle goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application. You can use DO_NOTHING_ON_CLOSE to prevent people from closing
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420,420); // sets the x.dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("src/20200722_213914-01.jpeg"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(Color.CYAN); // Change color of background
        frame.getContentPane().setBackground(new Color(0x12345));

 */

        MyFrame myFrame = new MyFrame();
    }


}
