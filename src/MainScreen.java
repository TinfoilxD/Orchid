import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;


public class MainScreen extends JFrame
{
    public MainScreen()
    {
        setTitle("Theme Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JLabel blackLabel = new JLabel("Black");
        JLabel whiteLabel = new JLabel("<html><font color='white'>White</font></html>");
        whiteLabel.setForeground(Color.BLACK);
        JLabel greenLabel = new JLabel("<html><font color='#9FC131'>Lime Green</font></html>");
        add(blackLabel);
        add(whiteLabel);
        add(greenLabel);



    }

}