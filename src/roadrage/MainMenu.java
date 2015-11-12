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
    private JRadioButton mopedRadioButton;
    private JRadioButton carRadioButton;
    private JRadioButton truckRadioButton;
    private JPanel mainMenuPanel;
    private JPanel sidebarMenuPanel;
    private ButtonGroup difficultyButtons;
    private ButtonGroup vehicleSelectionButtons;
    private JLabel welcomeMessage;
    
    // FIXED: Someone fix this spacing -- I'm moving onto other things. This should be simple in just  layout change.
    public MainMenu() {
        
        //setting up board layout
        super("Road Rage!");
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        mainMenuPanel = new JPanel();
        sidebarMenuPanel = new JPanel();
        welcomeMessage = new JLabel("Welcome to Road Rage!\n Please Select a Vehicle and Difficulty Below"); // TODO: Fix this to be a new line
       
        difficultyButtons = new ButtonGroup();
        vehicleSelectionButtons = new ButtonGroup();
        startGameButton = new JButton("Start Game");
        startGameButton.addActionListener(this);
        easyGameButton = new JRadioButton("Easy");
        mediumGameButton = new JRadioButton("Medium");
        hardGameButton = new JRadioButton("Hard");
        
        mopedRadioButton = new JRadioButton(new ImageIcon("Pictures/motocorcycleFIXED.png"));
        carRadioButton = new JRadioButton(new ImageIcon("Pictures/subaru.png"));
        truckRadioButton = new JRadioButton(new ImageIcon("Pictures/truck.png"));
        
        difficultyButtons.add(easyGameButton);
        difficultyButtons.add(mediumGameButton);
        difficultyButtons.add(hardGameButton);
        
        vehicleSelectionButtons.add(mopedRadioButton);
        vehicleSelectionButtons.add(carRadioButton);
        vehicleSelectionButtons.add(truckRadioButton);
      
        //map on board, weapon images
        mainMenuPanel.setLayout(new BorderLayout(200,0));

        //setting up sidebar
        sidebarMenuPanel.setLayout(new BoxLayout(sidebarMenuPanel, BoxLayout.PAGE_AXIS));
        sidebarMenuPanel.setSize(400, 1000);
        sidebarMenuPanel.setBackground(Color.gray);
        sidebarMenuPanel.add(easyGameButton);
        sidebarMenuPanel.add(mediumGameButton);
        sidebarMenuPanel.add(hardGameButton);
        sidebarMenuPanel.add(startGameButton);
        
        mainMenuPanel.add(welcomeMessage, BorderLayout.PAGE_START);
        mainMenuPanel.add(mopedRadioButton, BorderLayout.WEST);
        mainMenuPanel.add(carRadioButton, BorderLayout.CENTER);
        mainMenuPanel.add(truckRadioButton, BorderLayout.LINE_END);

        this.add(mainMenuPanel, BorderLayout.CENTER);
        this.add(sidebarMenuPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == startGameButton){
            // Launch the game with settings
            Board board = new Board(this);
        }
        this.setVisible(false);
    }
}
