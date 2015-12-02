/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadrage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import java.awt.*;

import java.util.Random;
import java.util.TimerTask;

import javax.swing.*;


/**
 *
 * @author sab5964
 */

public class ObjectsFalling extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(5, this);

    
    double x = 100, vely = 25, y = 25, velx = -25;
   // int min = 1,max = 3;
    Random rand = new Random();
    

    public void second() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2;
        g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
        

    }

    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }

    public void firstrow() {
       // velx = -200.00;
        y = 25;
        x= 100;
        down();
    }

    public void secondrow() {
       // velx = 200.00;
        y = 25;
        x=200;
        down();
        
    }
    public void thirdrow()
    {
        y = 25;
        x=300;
        down();
    }
    Timer timer = new Timer(500, null);
    public void down()
    {
        for( int w =0; w<14; w++)
        {
        y += vely;  // if the object falls to fast/slow change vely
       repaint();
       // if this has a timer then the object will fall at a normal rate
       // Thread.sleep(50);
        
     
        }
    }
    

    public void keyPressed(KeyEvent e) // this needs to be changed to startbutton was pressed
    {
        int code = e.getKeyCode();
        for( int q =0; q<10; q++)
        {
            int RandSlot = rand.nextInt((3)) + 1;
            if (RandSlot == 1) {
                firstrow();
                down();

            }
            if (RandSlot == 2) {
                secondrow();
                down();

            }
            if(RandSlot == 3)
            {
                thirdrow();
                down();
            }
            if ( code == KeyEvent.VK_DOWN)
            {
                down();
                y+= vely;
            }
        }    
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}  