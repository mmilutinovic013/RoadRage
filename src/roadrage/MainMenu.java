/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadrage;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class MainMenu extends JFrame implements ActionListener {
    private JButton startGameButton;
    private JRadioButton easyGameButton;
    private JRadioButton mediumGameButton;
    private JRadioButton hardGameButton;
    private JLabel mopedImage; // better name? 
    private JLabel carImage; // better name? 
    private JLabel truckImage; // better name? 
    private JPanel mainMenuPanel;
    private JPanel sidebarMenuPanel;
    private ButtonGroup difficultyButtons;

   
    int boardSize = 10;
    
    // FIXED: Someone fix this spacing -- I'm moving onto other things. This should be simple in just  layout change.
    public MainMenu() {
        
        //setting up board layout
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        mainMenuPanel = new JPanel();
        sidebarMenuPanel = new JPanel();
       
        difficultyButtons = new ButtonGroup();
        startGameButton = new JButton("Start Game");
        easyGameButton = new JRadioButton("Easy");
        mediumGameButton = new JRadioButton("Medium");
        hardGameButton = new JRadioButton("Hard");
        
        difficultyButtons.add(easyGameButton);
        difficultyButtons.add(mediumGameButton);
        difficultyButtons.add(hardGameButton);
      
        //map on board, weapon images
        mainMenuPanel.setLayout(new GridLayout(10,10));
        
        mopedImage = new JLabel(new ImageIcon("Pictures/motorcycle.png"));
        mopedImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        carImage = new JLabel(new ImageIcon("Pictures/subaru.png"));
        carImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        truckImage = new JLabel(new ImageIcon("Pictures/truckIcon.png"));
        truckImage.setAlignmentX(Component.CENTER_ALIGNMENT);

        //setting up sidebar
        sidebarMenuPanel.setLayout(new BoxLayout(sidebarMenuPanel, BoxLayout.PAGE_AXIS));
        sidebarMenuPanel.setSize(200, 800);
        sidebarMenuPanel.setBackground(Color.gray);
        sidebarMenuPanel.add(easyGameButton);
        sidebarMenuPanel.add(mediumGameButton);
        sidebarMenuPanel.add(hardGameButton);
        sidebarMenuPanel.add(startGameButton);
        sidebarMenuPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarMenuPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarMenuPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarMenuPanel.add(mopedImage);
        sidebarMenuPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarMenuPanel.add(carImage);
        sidebarMenuPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarMenuPanel.add(truckImage);

        //populating board with desks

        this.add(mainMenuPanel, BorderLayout.CENTER);
        this.add(sidebarMenuPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
