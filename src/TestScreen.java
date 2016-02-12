

import javax.swing.*;
import java.awt.*;

/*
Written by Tin Van.

 */

public class TestScreen extends JPanel
{

     public static final String SCREEN_TITLE = "Main Screen";

    public TestScreen()
    {

        setLayout(new FlowLayout());
        JLabel blackLabel = new JLabel("Black");
        JLabel whiteLabel = new JLabel("<html><font color='white'>White</font></html>");
        whiteLabel.setForeground(Color.BLACK);
        JLabel greenLabel = new JLabel("<html><font color='#9FC131'>Lime Green</font></html>");
        add(blackLabel);
        add(whiteLabel);
        add(greenLabel);


    }


}
