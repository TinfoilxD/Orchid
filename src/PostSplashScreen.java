import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
public class PostSplashScreen extends JFrame
{

    /*
    All final parameters are to be initiated up here. This is the spashscreen.
    The only parameter should be the image filepath. Make it relative to directory
    because other people will be working on it too.
     */
    private final String IMAGE_STRING = ".idea/resources/splash.png";


    public PostSplashScreen()
    {

        setUndecorated(true); //Makes a JFrame borderless and titleless. Using raw JWindow was unadvised.
        setImage();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        createMainScreen();
    }

    public void setImage()
    {
        BufferedImage splashImage;
        JLabel imageLabel;


        try
        {

            /*
            This section tries to get the image and adds it to the content pane. Currently, it assumes the image will always be read directly.
            Handling decisions will be made later.

             */
            splashImage = ImageIO.read(new File(IMAGE_STRING));
            imageLabel = new JLabel(new ImageIcon(splashImage));
            add(imageLabel, BorderLayout.CENTER);

        }
        catch(Exception e)
        {

            /*
            Prints out why the image coudn't be read.
             */
            System.out.println(e);
        }


        /*
        Frame handling
         */
    }
    public void createMainScreen()
    {
        MainScreen main = new MainScreen();

        /*
        READ CAREFULLY!!!
        This section will have an automated timer with a 4 second daily. This is to demonstrate splashscreen functionality or it'll simply disappear quickly.
        On production, we will switch the delayed timer with one that fires as soon as main is finished loading.
        We will delete the timer.


         */
        new Timer(4000, e -> {
            main.setVisible(true);
            dispose();
        }).start();


    }

    public static void main(String args[])
    {
        new PostSplashScreen();
    }
}