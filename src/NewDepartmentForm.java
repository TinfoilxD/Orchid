

/*
Written by Joshua Joseph.
 */


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class NewDepartmentForm extends JPanel
{
    public static final String SCREEN_TITLE = "New Department Form";

    // DepartmentID	autonumber
    //DepartmentName	varchar


    private JTextField departmentName; 		  // To enter Last Name
    private JPanel agePanel;         // To hold components
    private JPanel selectedAgePanel; // To hold components
    private JComboBox ageBox;        // list of ages
    private JLabel label;               // Displays a message
    private JTextField selectedAge;  // Selected age



    private String[] age = {"11", "12", "13", "14", "15", "16" ,"17",
            "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31",
            "32", "33", "34", "35", "36", "37", "38",
            "39", "40", "41", "42", "43", "44", "45"
    };



    /**
     Constructor
     */

    public NewDepartmentForm()
    {
        JLabel departmentNameFor = new JLabel("Department: ");

        departmentName = new JTextField(8);


        // Set the size of the window.
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 5));

        // Grid Layout
        setLayout(new GridLayout(5, 2));


        // Add the panel to the frame's content pane.
        add(departmentNameFor);
        add(departmentName);



        // Build the panels.
        buildAgePanel();
        buildSelectedAgePanel();

        // Add the panels to the content pane.
        add(agePanel);
        add(selectedAgePanel);

    }


    private void buildAgePanel()
    {
        // Create a panel to hold the combo box.
        agePanel = new JPanel();

        // Create the combo box
        ageBox = new JComboBox(age);

        // Register an action listener.
        ageBox.addActionListener(new ComboBoxListener());

        // Add the combo box to the panel.
        agePanel.add(ageBox);
    }

    /**
     The buildSelectedAgePanel method adds a
     read-only text field to a panel.
     */

    private void buildSelectedAgePanel()
    {
        // Create a panel to hold the components.
        selectedAgePanel = new JPanel();

        // Create the label.
        label = new JLabel("You selected: ");

        // Create the uneditable text field.
        selectedAge = new JTextField(10);
        selectedAge.setEditable(false);

        // Add the label and age field to the panel.
        selectedAgePanel.add(label);
        selectedAgePanel.add(selectedAge);
    }

    /**
     Private inner class that handles the event when
     the user selects an item from the combo box.
     */

    private class ComboBoxListener
            implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Get selected age.
            String selection =
                    (String) ageBox.getSelectedItem();

            // Display selected age in the text field.
            selectedAge.setText(selection);
        }
    }

}


