package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {


    JButton button;

    public static void main(String[] args) {
        
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
        }


    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setTitle("Button change");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
button.setText("I've been clicked");
    }
}
