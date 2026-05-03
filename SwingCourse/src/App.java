import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        ImageIcon icon = new ImageIcon(App.class.getResource("./asset/thumbs-up.png"));
        // Resize Icon
        Image iconImage = icon.getImage(); // Turn icon to image
        Image resizeIconImage = iconImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Resize Image

        // Turn image to icon
        ImageIcon imageIcon = new ImageIcon(resizeIconImage);

        JLabel label = new JLabel();
        label.setText("HELLO!");
        label.setIcon(imageIcon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75); // if layout is null

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        // Border Layout
        greenPanel.setLayout(new BorderLayout());

        // Setup JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.add(redPanel);
        frame.setVisible(true);
        // Add the panels, etc.
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}

// TImestamp: 42:30
