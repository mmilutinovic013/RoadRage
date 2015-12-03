package roadrage;

import java.awt.*;
import java.awt.event.*;

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Rectangle;


public class Board extends JFrame implements ActionListener {

    private JLabel map;
    private JLayeredPane gameboard;
    private JLayeredPane sidebar;
    private JLayeredPane foreGround;
    private JButton startButton; // This is testing if the sidebar Panel exists
    private JButton quitButton; // This is testing if the sidebar Panel exists
    private int currentScore;
    private int currentHealth;
    private MainMenu menu;
    
    public Board(MainMenu theMenu) {
        
        //setting up board layout
        //theFrame = new JFrame("Road Rage Game Board"); //super("Road Rage Game Board");
        super();
        this.createComponents();
        menu = theMenu;
        
    }
    
    public void createComponents(){
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        map = new JLabel(new ImageIcon("Pictures/Road800x800.png"));// Figure out proper image size
        currentScore = 0; // Current Score starts at 0 upon game start.
        currentHealth = 100;
        gameboard = new JLayeredPane();
        sidebar = new JLayeredPane();
        foreGround = new JLayeredPane();
        Car car = new Car();
        
        
       
        
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        //game board with map overlay
        
        gameboard.setSize(800, 800);
        gameboard.add(map);

        //setting up sidebar
        
        sidebar.setSize(400, 1000);
        sidebar.add(startButton);
        
       
        foreGround.setSize(800, 800);
        foreGround.setOpaque(false);
        
        
        quitButton = new JButton("Quit");

        sidebar.add(quitButton);
        quitButton.addActionListener(this);
        foreGround.add(car);
        
        this.add(gameboard);
        this.add(sidebar);
        this.add(foreGround);
        
        
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //
    // This will be called when Object is dodged.
    //
    public void updateScore(int scoreUpdate){
        currentScore += scoreUpdate;
    }
    //
    // This will be called on collision.
    //
    public void updateHealth(int healthUpdate){
        currentHealth += healthUpdate;
    }
    
    public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource();
        if(obj == startButton){
            ObjectsFalling falling = new ObjectsFalling();
            System.out.println("here");
        }
        else if(obj == quitButton){
            this.dispose();
            menu.setVisible(true);
        }
    }
}


    
