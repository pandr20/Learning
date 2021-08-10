package Labels;

import GUI.MyFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("src/Programming.jpg");
        Border border = BorderFactory.createLineBorder(Color.blue,3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER OR RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.blue); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50)); // set font of text
        label.setIconTextGap(25); //set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        //label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions



        JFrame frame = new Jframe();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // add last
    }


}
