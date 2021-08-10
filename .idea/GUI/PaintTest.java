package GUI;

import java.awt.*;

public class PaintTest {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

        g2d.setPaint(gradient);

        g2d.fillOval(70, 70, 100, 100);
    }
        public void paintComponent2 (Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color startColor = new Color(red,green,blue);

            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            Color endColor = new Color(red,green,blue);

            GradientPaint gradient2 = new GradientPaint(70,70,startColor,150,150,endColor);
            g2d.setPaint(gradient2);
            g2d.fillOval(70,70,100,100);
        }

    public static void main(String[] args) {

    }
    }



