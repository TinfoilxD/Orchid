import javax.swing.*;
import javax.swing.JFrame;


public class FrameScreen extends JFrame
{

    private final String APP_TITLE = "Orchid";
    private final String MENU_1 = "Project";
    private final String MENU_2 = "Test String 2";
    private final String MENU_3 = "Test String 3";
    private final String MENU_4 = "Test String 4";
    private final String[] MENU1_SUBMENU = {"New Project", "Open Project", "Manage Project"};
    private final String[] MENU2_SUBMENU = {"MENU2_SUBMENU1", "MENU2_SUBMENU2", "MENU2_SUBMENU3"};
    private final String[] MENU3_SUBMENU = {"MENU3_SUBMENU1", "MENU3_SUBMENU2", "MENU3_SUBMENU3"};
    private final String[] MENU4_SUBMENU = {"MENU4_SUBMENU1", "MENU4_SUBMENU2", "MENU4_SUBMENU3"};



    public FrameScreen()
    {
        setTitle(APP_TITLE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700,600);


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
        JMenu menuItem1 = new JMenu(MENU_1);
        menuItem1.add(new JMenuItem(MENU1_SUBMENU[0]));
        menuItem1.add(new JMenuItem(MENU1_SUBMENU[1]));
        menuItem1.add(new JMenuItem(MENU1_SUBMENU[2]));

        return menuItem1;

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