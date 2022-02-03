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
public class String  implements Drawable{
    Anchor leftA;
    Anchor rightA;

    public String(Anchor leftA, Anchor rightA) {
        this.leftA = leftA;
        this.rightA = rightA;
    }
    
    public void draw(Graphics2D g2d, float zoom)
    {
        g2d.setColor(Color.ORANGE);
        g2d.drawLine((int)(leftA.x * zoom), (int)(leftA.y * zoom), (int)(rightA.x * zoom), (int)(rightA.y * zoom));
    }
}
