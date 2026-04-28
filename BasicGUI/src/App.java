import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You're " + age + " yrs old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? (cm)"));
        JOptionPane.showMessageDialog(null, "Oh! your " + height + " cm.");
    }
}
