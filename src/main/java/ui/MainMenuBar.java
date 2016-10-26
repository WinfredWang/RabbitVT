package ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * @author Winfred   
 * @date 2016年10月26日
 * @version V1.0  
 */
public class MainMenuBar extends JMenuBar {
    private static final long serialVersionUID = 3993202395037016725L;
    
    private JMenu[] menu = {new JMenu("View"),  new JMenu("Settings")};
    
    /**
     * 
     */
    public MainMenuBar() {
        super();
        for (JMenu m : menu) {
            this.add(m);
        }
    }
}
