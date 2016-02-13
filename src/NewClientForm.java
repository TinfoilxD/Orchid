

/*
Written by Tin Van.
 */


import javax.swing.*;
import java.awt.*;

public class NewClientForm extends JPanel
{
    /*
    ClientID	autonumber
    ClientFirstName	varchar
    ClientLastName	varchar
    fieldClientAddress1	varchar
    fieldClientAddress2	varchar
    fieldClientCity	varchar
    fieldClientCounty	varchar
    comboBoxClientState	varchar
    fieldClientZipCode	varchar
    fieldClientPhone	varchar
    fieldClientExtension	varchar
    fieldClientEmail	varchar
    IsDeleted	bit
        */

    private JTextField fieldClientFirstName;
    private JTextField fieldClientLastName;
    private JTextField fieldClientAddress1;
    private JTextField fieldClientAddress2;
    private JTextField fieldClientCity;
    private JTextField fieldClientCounty;
    private JComboBox<String> comboBoxClientState;
    private JTextField fieldClientZipCode;
    private JTextField fieldClientPhone;
    private JTextField fieldClientExtension;
    private JTextField fieldClientEmail;

    public NewClientForm()
    {
        setLayout(new FlowLayout());
        initializeComponents();

    }
    private void initializeComponents()
    {

        //intialize

        fieldClientFirstName = new JTextField(30);
        fieldClientLastName = new JTextField(30);
        fieldClientAddress1 = new JTextField(30);
        fieldClientAddress2 = new JTextField(30);
        fieldClientCity = new JTextField(30);
        fieldClientCounty = new JTextField(30);
        comboBoxClientState = new JComboBox<String>();
        comboBoxClientState.setEditable(false);
        fieldClientZipCode = new JTextField(30);
        fieldClientPhone = new JTextField(30);
        fieldClientExtension = new JTextField(30);
        fieldClientEmail = new JTextField(30);

        //add to panel

        add(fieldClientFirstName);
        add(fieldClientLastName);
        add(fieldClientAddress1);
        add(fieldClientAddress2);
        add(fieldClientCity);
        add(fieldClientCounty);
        add(comboBoxClientState);
        add(fieldClientZipCode);
        add(fieldClientPhone);
        add(fieldClientExtension);
        add(fieldClientEmail);
    }

}
