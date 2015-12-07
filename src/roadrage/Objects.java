package roadrage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class Objects extends JPanel implements ActionListener {

    Timer t = new Timer(5, this);                                                // if the objects move to slowly change the numerical value
    double x = 100, vely = 25, y = 25, velx = -25;                               // if the objects are falling to slowly/quickly change y higher/lower
    Random rand = new Random();
    
    public void second() {
        t.start();
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = null;
        Image img1 = Toolkit.getDefaultToolkit().getImage("obstacle.png");
        g2.drawImage(img1,180,180,this);
        g2.finalize();
        g2 = (Graphics2D) g;
    }
    
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public void firstrow() {
        y = 25;
        x= 100;
        down();
    }
    
    public void secondrow() {
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
        y += vely;                                                                // if the object falls to fast/slow change vely
       repaint();
       second();
        }
    }
    
    public void Objects()                                                // this needs to be changed to startbutton was pressed
    {
        System.out.println("objects");
        for( int q =0; q<10; q++)                                                 // this will send 10 things down
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
            {
                down();
                y+= vely;
            }
        }    
    }
}
