/*
Written by Joshua Joseph.
 */


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class NewEmployeeForm extends JPanel
{
    public static final String SCREEN_TITLE = "New Employee Form";

    private JTextField lastName; 		  // To enter Last Name
    private JTextField firstName; 	  // To enter First Name
    private JTextField departmentName;
    private JTextField address1;
    private JTextField address2;
    private JTextField city;
    private JTextField county;
    private JTextField state;
    private JTextField zipCode;
    private JTextField phone;
    private JTextField extension;
    private JTextField personalPhone;
    private JTextField email;
    private JTextField isDeleted;


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

    public NewEmployeeForm()
    {
        JLabel lastNameFor = new JLabel("Last Name: ");
        JLabel firstNameFor = new JLabel("First Name: ");
        JLabel departmentNameFor = new JLabel("Department: ");


        lastName = new JTextField(35);
        firstName = new JTextField(35);
        departmentName = new JTextField(35);
        address1 = new JTextField(35);
        address2 = new JTextField(35);
        // Set the size of the window.
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 2));

        // Grid Layout



        // Add the panel to the frame's content pane.
        add(lastNameFor);
        add(lastName);
        add(firstNameFor);
        add(firstName);
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

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);
        NewEmployeeForm tr = new NewEmployeeForm();
        frame.add(tr);
        frame.setVisible(true);
    }
}
