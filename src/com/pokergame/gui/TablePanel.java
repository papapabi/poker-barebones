package com.pokergame.gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Custom Panel class which extends from JPanel that overrides the
 * paintComponent() method.
 *
 * @author Joshua Isaac
 */
public class TablePanel extends JPanel {

    Image bg = new ImageIcon("images/defaulttable.jpg").getImage();

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}
