/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phy1061lab2;


import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author fes77
 */
public class Anchor extends Position implements Drawable{

    float size = 0.01f;
    public Anchor(float x, float y) {
        super(x, y);
    }
    
    public void draw(Graphics2D g2d)
    {
        draw(g2d, 100);
    }
    
    public void draw(Graphics2D g2d, float zoom)
    {
        g2d.setColor(Color.RED);
        g2d.drawOval((int)((x - size/2) * zoom), (int)((y - size/2) * zoom), (int)(size * zoom), (int)(size * zoom));
    }
}
