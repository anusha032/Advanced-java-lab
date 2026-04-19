//* Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
// * is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
// * implementing the event handling mechanism with addActionListener( ).


package lab4;
import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        // Label to display message
        label = new JLabel();
        label.setBounds(50, 50, 400, 30);

        // Load images (Make sure images are in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("clock.jpg");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.jpg");

        // Buttons with images
        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourglassIcon);

        btnClock.setBounds(50, 100, 120, 120);
        btnHourGlass.setBounds(200, 100, 120, 120);

        // Event handling
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}