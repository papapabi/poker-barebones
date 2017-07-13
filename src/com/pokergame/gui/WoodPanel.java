package com.pokergame.gui;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author riana joy
 */

public class WoodPanel extends JPanel {

    Image bg = new ImageIcon("images/wood.jpg").getImage();

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}