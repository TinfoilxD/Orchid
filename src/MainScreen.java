import javax.swing.*;
import java.awt.*;


public class MainScreen extends FrameScreen
{
    public MainScreen()
    {

        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JLabel blackLabel = new JLabel("Black");
        JLabel whiteLabel = new JLabel("<html><font color='white'>White</font></html>");
        whiteLabel.setForeground(Color.BLACK);
        JLabel greenLabel = new JLabel("<html><font color='#9FC131'>Lime Green</font></html>");
        add(blackLabel);
        add(whiteLabel);
        add(greenLabel);
        pack();

    }
}
