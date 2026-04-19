//* Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//* France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
// * countries on console whenever the countries are selected on the list.

package swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryListExample {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // JList
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Scroll Pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Map for country-capital
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital (continent)");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Event Handling
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        String capital = capitalMap.get(selectedCountry);
                        System.out.println("Country: " + selectedCountry +
                                           " -> Capital: " + capital);
                    }
                }
            }
        });

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Visible
        frame.setVisible(true);
    }
}
