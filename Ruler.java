/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phy1061lab2;

import com.badlogic.gdx.math.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author fes77
 */
public class Ruler implements Drawable, Movable{
    Position p = new Position(0, 0);
    float width = 0.5f;
    float height = 0.1f;
    
    float smallStep = 0.01f;
    float middleStep = 0.05f;
    float bigStep = 0.1f;
    
    float shiftX = 0f;
    float shiftY = 0f;

    public Ruler() {
//        setBackground(new Color(0, 0, 0, 0));
    }
    
    public Ruler(float width) {
//        setBackground(new Color(0, 0, 0, 0));
        this.width = width;
    }
    
    public Ruler(float width, Position p) {
//        setBackground(new Color(0, 0, 0, 0));
        this.width = width;
        this.p = p;
    }
    
    public void draw(Graphics2D g2d, float zoom)
    {
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect((int)((p.x - width / 2f) * zoom), (int)((p.y - height / 2f) * zoom), (int)(width * zoom), (int)(height * zoom));
        g2d.setColor(Color.BLACK);
        
        // big step
        for(int i = 0; i <= width / bigStep; i++)
            g2d.drawLine(
                    (int)((p.x - width / 2f + i * bigStep) * zoom),
                    (int)((p.y) * zoom),
                    (int)((p.x - width / 2f + i * bigStep) * zoom),
                    (int)((p.y - height / 2f) * zoom));
        
        // middle step
        for(int i = 0; i <= width / middleStep; i++)
            g2d.drawLine(
                    (int)((p.x - width / 2f + i * middleStep) * zoom),
                    (int)((p.y - height * 1 / 4f) * zoom),
                    (int)((p.x - width / 2f + i * middleStep) * zoom),
                    (int)((p.y - height / 2f) * zoom));
        
        // small step
        for(int i = 0; i <= width / smallStep; i++)
            g2d.drawLine(
                    (int)((p.x - width / 2f + i * smallStep) * zoom),
                    (int)((p.y - height * 3 / 8f) * zoom),
                    (int)((p.x - width / 2f + i * smallStep) * zoom),
                    (int)((p.y - height / 2f) * zoom));
        
        // Draw X axis label
        for(int i = 0; i <= width / bigStep; i++)
        {
            g2d.drawString(i * 10 +"", (int)((p.x - width / 2f + i * bigStep) * zoom), (int)((p.y) * zoom));
        }
    }
    
    @Override
    public void movePosition(float dx, float dy)
    {
        p.add(dx, dy);
    }

    @Override
    public boolean isClicked(int pixelX, int pixelY, float zoom) {
        Rectangle rect = new Rectangle((p.x - width / 2) * zoom, (p.y + height / 2) * zoom, width * zoom, height * zoom);
        return rect.contains(pixelX, pixelY);
    }
    
    @Override
    public void setPosition(float x, float y) {
        p.x = x;
        p.y = y;
    }

}
