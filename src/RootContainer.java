/*
Written by Tin Van

 */


import javax.swing.*;
import java.awt.*;

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

        JPanel emptyPanel = new JPanel(); //This is to have an empty mainscreen. Otherwise, the first card in stack will display.
        MainScreen mainScreen = new MainScreen();


        cardContainer.add(emptyPanel);
        cardContainer.add(mainScreen, MainScreen.SCREEN_TITLE);
    }

    @Override
    public void setMenu1Submenu1()
    {
        cardLayout.show(cardContainer, MainScreen.SCREEN_TITLE);
    }
    public void setVisible(boolean b)
    {
        frame.setVisible(b);
    }
}
