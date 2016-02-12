

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
    ClientAddress1	varchar
    ClientAddress2	varchar
    ClientCity	varchar
    ClientCounty	varchar
    ClientState	varchar
    ClientZipCode	varchar
    ClientPhone	varchar
    ClientExtension	varchar
    ClientEmail	varchar
    IsDeleted	bit
        */

    private JTextField clientFirstName;
    private JTextField clientLastName;
    private JTextField clientAddress1;
    private JTextField clientAddress2;
    private JTextField clientCity;
    private JTextField clientCounty;
    private JComboBox<String> clientState;
    private JTextField clientZipCode;
    private JTextField clientPhone;
    private JTextField clientExtension;
    private JTextField clientEmail;

    public NewClientForm()
    {
        setLayout(new FlowLayout());
        initializeComponents();

    }
    private void initializeComponents()
    {

        //intialize

        clientFirstName = new JTextField(30);
        clientLastName = new JTextField(30);
        clientAddress1 = new JTextField(30);
        clientAddress2 = new JTextField(30);
        clientCity = new JTextField(30);
        clientCounty = new JTextField(30);
        clientState = new JComboBox<String>();
        clientState.setEditable(false);
        clientZipCode = new JTextField(30);
        clientPhone = new JTextField(30);
        clientExtension = new JTextField(30);
        clientEmail = new JTextField(30);

        //add to panel

        add(clientFirstName);
        add(clientLastName);
        add(clientAddress1);
        add(clientAddress2);
        add(clientCity);
        add(clientCounty);
        add(clientState);
        add(clientZipCode);
        add(clientPhone);
        add(clientExtension);
        add(clientEmail);
    }

}
