
import javax.swing.*;
import java.awt.*;


/*
Written by Tin Van.

 */


public class RootContainer implements FrameScreenController
{
    FrameScreen frame;
    JPanel cardContainer;
    CardLayout cardLayout;

    public RootContainer()
    {
        frame = new FrameScreen(this);
        cardLayout = new CardLayout();
        cardContainer = new JPanel(cardLayout);
        frame.setContentPane(cardContainer);

        setScreenReferences();



    }
    private void setScreenReferences()
    {


        TestScreen testScreen = new TestScreen();

        cardContainer.add(testScreen, TestScreen.SCREEN_TITLE);
    }

    @Override
    public void setMenu1Submenu1()
    {
        cardLayout.show(cardContainer, TestScreen.SCREEN_TITLE);
    }
    public void setVisible(boolean b)
    {
        frame.setVisible(b);
    }
}
