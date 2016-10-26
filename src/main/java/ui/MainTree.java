package ui;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Winfred   
 * @date 2016年10月26日
 * @version V1.0  
 */
public class MainTree extends JTree {
    /**
     * 
     */
    public MainTree() {
        super();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("软件部");
        root.add(new DefaultMutableTreeNode(new String("小花")));
    }
}
