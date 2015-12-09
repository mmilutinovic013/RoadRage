/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadrage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author bqa5094
 */
public class Map extends JPanel {

    public Map() {
        super();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        BufferedImage background = null;
        try {
            background = ImageIO.read(new File("Pictures/Road800x800.png"));
        } catch (IOException e) {
            System.out.println("error");
        }

        g.drawImage(background, 0,0, this);
    }

}
