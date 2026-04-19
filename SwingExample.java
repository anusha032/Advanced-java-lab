//* Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming
//* in Blue color plain font with font size of 32 using Jframe and Jlabel

package lab4;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class SwingExample {

    SwingExample() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jfrm.setSize(400, 200);

        // Terminate the program when closed
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", JLabel.CENTER);

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 18));
        jlab.setForeground(new Color(0, 0, 255));

        // Add label to frame
        jfrm.add(jlab);

        // Make frame visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        // Run GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
