package ui;

import java.awt.Component;

import javax.swing.JSplitPane;

/**
 * @author Winfred   
 * @date 2016年10月26日
 * @version V1.0  
 */
public class MainSplitPane extends JSplitPane {

    /**
     * 
     */
    private static final long serialVersionUID = 9065716299183324950L;

    /**
     * @param newOrientation
     * @param newLeftComponent
     * @param newRightComponent
     */
    public MainSplitPane(Component newLeftComponent, Component newRightComponent) {
        super(JSplitPane.HORIZONTAL_SPLIT);
        setDividerSize(1);
        setDividerLocation(50);
        setOneTouchExpandable(true);
        setContinuousLayout(true);
        setVisible(true);
        setLeftComponent(newLeftComponent);
        setRightComponent(newRightComponent);
    }
}
