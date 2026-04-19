package swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneColorExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels for each tab
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Label to display selected color
        JLabel label = new JLabel("Select a tab", JLabel.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        // Event handling
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                label.setText("Selected Color: " + title);
                System.out.println("Selected Color: " + title);
            }
        });

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}