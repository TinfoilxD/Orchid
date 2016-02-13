



import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Written by Tin Van.

 */


/*
This is the class which all screens within orchid will extend. This class develops basic functionality of the main and
intializes frame settings. Note that none of the frames are set to visible. Visibilty is switched by the calling method and not
by instantiating the object. This is in case we decide to load all frames at once.

 */

public class FrameScreen extends JFrame
{

    /*
    All constants go up here for easy edits.

     */

    private final String APP_TITLE = "Orchid";
    private final String MENU_1 = "Project";
    private final String MENU_2 = "Client";
    private final String MENU_3 = "Test String 3";
    private final String MENU_4 = "Test String 4";
    private final String[] MENU1_SUBMENU = {"New Project", "Open Project", "Manage Project"};
    private final String[] MENU2_SUBMENU = {"New Client", "MENU2_SUBMENU2", "MENU2_SUBMENU3"};
    private final String[] MENU3_SUBMENU = {"MENU3_SUBMENU1", "MENU3_SUBMENU2", "MENU3_SUBMENU3"};
    private final String[] MENU4_SUBMENU = {"MENU4_SUBMENU1", "MENU4_SUBMENU2", "MENU4_SUBMENU3"};


    private FrameScreenController frameScreenController;


    public FrameScreen(FrameScreenController frameScreenController)
    {

        //Reference containing object to add listeners to the menu buttons


        this.frameScreenController = frameScreenController;


        /*
        This section initializes JFrame values to the defaults that will be used by all orchid frames. There might be some
        exceptions that will be addressed individually.

         */
        setTitle(APP_TITLE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700,600);



        /*
        The instantiation of the main menu is divided into a tree-like structure.
        createMainMenu() - > createMenu1() - > createSubMenu()

         */
        createMainMenu();


    }
    private void createMainMenu()
    {
        JMenuBar menuBar = new JMenuBar();


        menuBar.add(createMenu1());
        menuBar.add(createMenu2());
        menuBar.add(createMenu3());
        menuBar.add(createMenu4());
        
        setJMenuBar(menuBar);
    }
    private JMenu createMenu1()
    {
        JMenu menu1 = new JMenu(MENU_1);

        JMenuItem menuItem1 = new JMenuItem(MENU1_SUBMENU[0]);
        menuItem1.addActionListener(e ->
        {

                frameScreenController.setMenu1Submenu1();

        });
        menu1.add(menuItem1);
        menu1.add(new JMenuItem(MENU1_SUBMENU[1]));
        menu1.add(new JMenuItem(MENU1_SUBMENU[2]));

        return menu1;

    }
    private JMenuItem createMenu2()
    {
        JMenu menuItem2 = new JMenu(MENU_2);
        menuItem2.add(new JMenuItem(MENU2_SUBMENU[0]));
        menuItem2.add(new JMenuItem(MENU2_SUBMENU[1]));
        menuItem2.add(new JMenuItem(MENU2_SUBMENU[2]));
        return menuItem2;

    }
    private JMenu createMenu3()
    {
        JMenu menuItem3 = new JMenu(MENU_3);
        menuItem3.add(new JMenuItem(MENU3_SUBMENU[0]));
        menuItem3.add(new JMenuItem(MENU3_SUBMENU[1]));
        menuItem3.add(new JMenuItem(MENU3_SUBMENU[2]));
        return menuItem3;

    }
    private JMenu createMenu4()
    {
        JMenu menuItem4 = new JMenu(MENU_4);
        menuItem4.add(new JMenuItem(MENU4_SUBMENU[0]));
        menuItem4.add(new JMenuItem(MENU4_SUBMENU[1]));
        menuItem4.add(new JMenuItem(MENU4_SUBMENU[2]));
        return menuItem4;

    }
}

/*
This interface is implemented by the containing object to implement the methods used in the listeners.
All callback methods go here.
 */

interface FrameScreenController
{
    public void setMenu1Submenu1();
}