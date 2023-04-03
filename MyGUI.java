import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String destinationTitle = JOptionPane.showInputDialog(null, "What is your destination title?");
        JOptionPane.showMessageDialog(null, "Hello " + name + "! Your destination title is " + destinationTitle + ".");
    }
}
