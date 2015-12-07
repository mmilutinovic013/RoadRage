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

import javax.swing.*;

public class Car extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(5, this);
    
    int x = 350, y = 600;
    double velx = 0;

    public Car() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setOpaque(false);
        setFocusTraversalKeysEnabled(false);
        //ImageIcon image = new ImageIcon ("W:\\\\IST311\\\\realprototype2\\\\ProductUnknown\\\\Tests\\\\src\\\\subaru.png");
    }

     public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon i = new ImageIcon("Pictures/subaru.png");
        i.paintIcon(this, g, x, y);
        requestFocusInWindow();
        

    }

    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }

    public void left() {
        velx = -200.00;
    }

    public void right() {
        velx = 200.00;
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            left();
        }
        if (code == KeyEvent.VK_RIGHT) {
            right();
        }
            x += velx;
         
    }
    
   

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}