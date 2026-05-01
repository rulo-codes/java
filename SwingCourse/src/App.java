import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) throws Exception {
        // Set Frame
        JFrame frame = new JFrame();

        // Change Window Icon
        ImageIcon imageIcon = new ImageIcon(App.class.getResource("/asset/logo.png"));
        frame.setIconImage(imageIcon.getImage());

        // Add Background
        frame.getContentPane().setBackground(new Color(200, 200, 200));

        // Add Label
        JLabel label = new JLabel();
        label.setText("Bro, just code and vibe!");
        frame.add(label);

        // Add Image
        ImageIcon imageCat = new ImageIcon(App.class.getResource("/asset/logo.png"));
        Image iconImage = imageCat.getImage(); // Turn icon to image
        Image resizeIconImage = iconImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH); // Resize Image
        ImageIcon imageCatIcon = new ImageIcon(resizeIconImage); // Turn image to icon
        label.setIcon(imageCatIcon); // Set icon to text

        // Position Text and Image
        label.setHorizontalTextPosition(JLabel.CENTER);// Horizontal Text Position
        label.setVerticalTextPosition(JLabel.TOP);// Vertical Text Position

        // Style Text Label
        label.setForeground(Color.red); // Set Text Color
        label.setFont(new Font("Roboto", Font.PLAIN, 20)); // Set Font Family
        label.setIconTextGap(30);// Set gap between Text and Icon
        label.setBackground(Color.white);// Set Label Background Color
        label.setOpaque(true);// Display Label Background

        // Set Label Border
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// Vertical Position of Label + Image
        label.setHorizontalAlignment(JLabel.CENTER);// Horizontal Position of Label + Image
        label.setBounds(100, 100, 300, 300);// Set X and Y boundary of Border

        // Set Frame Properties
        frame.setTitle("Java Swing Course");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 600); // ensure explicit size when using null layout
        frame.setVisible(true);
        frame.pack();
    }
}

// TImestamp: 30:06
