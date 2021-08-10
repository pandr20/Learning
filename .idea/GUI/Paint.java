package GUI;

import javax.swing.*;
import java.awt.*;


public class Paint extends JPanel {

    public static void main(String[] args) {

    }

    public void paintComponents(Graphics g){
        g.setColor(Color.orange);

        g.fillRect(20,50,100,1000);
    }
}
