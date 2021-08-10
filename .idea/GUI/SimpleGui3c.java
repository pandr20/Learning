package GUI;

import Labels.Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3c implements ActionListener {

    Jframe frame;

    public static void main(String[] args) {
        SimpleGui3c gui = new SimpleGui3c();
        gui.go();

    }

    public void go() {
        frame = new Jframe();
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);


        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);



    }

    public void actionPerformed (ActionEvent event) {
        frame.repaint();
    }

}
