package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("JFrame tiltle goes here"); // sets title of Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application. You can use DO_NOTHING_ON_CLOSE to prevent people from closing
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420,420); // sets the x.dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("src/20200722_213914-01.jpeg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // Change icon of frame
        this.getContentPane().setBackground(Color.CYAN); // Change color of background
        this.getContentPane().setBackground(new Color(0x12345));
    }
}
