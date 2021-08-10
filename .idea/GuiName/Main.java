package GuiName;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        // Making a GUI that get user name input, then display it to the user
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Making a GUI that get user age input, JoptionPane is a string method, we change the value to a integer and parsed the value in, then display it to the user
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");


        // Making a GUI that get user height input, JoptionPane is a string method, we change the value to a double and parsed the value in, then display it to the user
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");



    }
}
