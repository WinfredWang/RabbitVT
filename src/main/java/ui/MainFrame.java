package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * @author Winfred   
 * @date 2016年10月26日
 * @version V1.0  
 */
public class MainFrame extends JFrame {
    private static final long serialVersionUID = -8808883923263763897L;
    
    private JMenuBar menuBar;
    private JSplitPane spilt;
    private JPanel leftPanel;
    private JPanel rightPanel;
    /**
     * 初始化主框架 
     */
    public MainFrame() {
        
        super("Jackrabbit Visual Tool");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 450);
        setLocation(400, 100);
        
        initMenu();
        initContent();
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
    }
    
    /**
     * initial menu bar.
     */
    private void initMenu() {
        menuBar = new MainMenuBar();
        setJMenuBar(menuBar);
    }
    
    private void init() {
        leftPanel = new JPanel();
        JButton b1= new JButton("Left");
        leftPanel.add(b1);
        rightPanel = new JPanel();
        JButton b2= new JButton("Right");
        rightPanel.add(b2);
        
        spilt = new MainSplitPane(leftPanel, rightPanel);
        setContentPane(spilt);
    }


    private void initContent() {
        init();
       /* DefaultMutableTreeNode root = new DefaultMutableTreeNode("软件部");
        root.add(new DefaultMutableTreeNode(new String("小花")));
        JTree tree = new JTree(root);
        tree.setVisible(true);
        panel = new MainPanel(tree);
        
        setContentPane(panel);*/
    }
}
