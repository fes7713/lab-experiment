/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phy1061lab2;

import com.badlogic.gdx.math.Rectangle;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fes77
 */
public class Mass  implements Drawable, Movable, Updatable{
    public static enum Alignment {VERTICAL, HORISONTAL}
    Position p;
    Velosity v;
    Acceleration a;
    
    float mass; // in kg
    
    float width;
    float height;
    Alignment alignment;
    
    Anchor topLeft;
    Anchor topMiddle;
    Anchor topRight;
    Anchor middleLeft;
    Anchor center;
    Anchor middleRight;
    Anchor bottomLeft;
    Anchor bottomMiddle;
    Anchor bottomRight;
    
    List<Anchor> anchorList;

    public Mass(Position p, Velosity v, Acceleration a, float mass, float width, float height, Alignment alignment) {
        this.p = p;
        this.v = v;
        this.a = a;
        this.mass = mass;
        this.width = width;
        this.height = height;
        this.alignment = alignment;
        
        topLeft = new Anchor(p.x - width/2, p.y - height/2);
        topMiddle = new Anchor(p.x , p.y - height/2);
        topRight = new Anchor(p.x + width/2, p.y - height/2);
        middleLeft = new Anchor(p.x - width/2, p.y);
        center = new Anchor(p.x, p.y);
        middleRight = new Anchor(p.x + width/2, p.y);
        bottomLeft = new Anchor(p.x - width/2, p.y + height/2);
        bottomMiddle = new Anchor(p.x, p.y + height/2);
        bottomRight = new Anchor(p.x + width/2, p.y + height/2);
        
        anchorList = new ArrayList<>();
        anchorList.add(topLeft);
        anchorList.add(topMiddle);
        anchorList.add(topRight);
        anchorList.add(middleLeft);
        anchorList.add(center);
        anchorList.add(middleRight);
        anchorList.add(bottomLeft);
        anchorList.add(bottomMiddle);
        anchorList.add(bottomRight);
    }
    
    private void updateAnchors(float deltatime)
    {
        float dx = v.x * deltatime;
        float dy = v.y * deltatime;

        for(int i = 0; i < anchorList.size(); i++)
        {
            anchorList.get(i).add(dx, dy);
        }
    }
    
    public void draw(Graphics2D g2d)
    {
        draw(g2d, 100);
    }
    
    public void draw(Graphics2D g2d, float zoom)
    {
        g2d.setColor(Color.BLACK);
        g2d.fillRect((int)((p.x - width / 2f) * zoom), (int)((p.y - height / 2f) * zoom), (int)(width * zoom), (int)(height * zoom));
        for(int i = 0; i < anchorList.size(); i++)
        {
            anchorList.get(i).draw(g2d, zoom);
        }
        
        g2d.setFont(new Font("Serif", Font.PLAIN, 18));
        FontMetrics metrics = g2d.getFontMetrics(g2d.getFont());
        // get the height of a line of text in this
        // font and render context
        int hgt = metrics.getHeight();
        // get the advance of my text in this font
        // and render context
        int adv = metrics.stringWidth(toString());
        // calculate the size of a box to hold the
        g2d.drawString(toString(), (int)((p.x - width / 2f) * zoom) - adv / 2, (int)((p.y - height / 2f) * zoom) - hgt / 2);
    }
    
    public void update(float deltatime)
    {
        v.x += a.x * deltatime;
        v.y += a.y * deltatime;
        p.x += v.x * deltatime;
        p.y += v.y * deltatime;
        updateAnchors(deltatime);
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
    
    public void setForce(Force f)
    {
        a.x = f.x/mass;
        a.y = f.y/mass;
    }
    
    public void setAcceleration(Acceleration a)
    {
        this.a.x = a.x;
        this.a.y = a.y;
    }
    
    public void setAcceleration(float x, float y)
    {
        this.a.x = x;
        this.a.y = y;
    }
    
    public void setVelosity(Velosity v)
    {
        this.v.x = v.x;
        this.v.y = v.y;
    }
    
    public void setVelosity(float x, float y)
    {
        this.v.x = x;
        this.v.y = y;
    }
    
    public Position getPosition()
    {
        return p;
    }
    
    public float getSpeed()
    {
        return v.len();
    }
    public float getMass()
    {
        return mass;
    }

    public float getHeight() {
        return height;
    }
    
    public float getWidth() {
        return width;
    }

    public Anchor getTopLeft() {
        return topLeft;
    }

    public Anchor getTopMiddle() {
        return topMiddle;
    }

    public Anchor getTopRight() {
        return topRight;
    }

    public Anchor getMiddleLeft() {
        return middleLeft;
    }

    public Anchor getCenter() {
        return center;
    }

    public Anchor getMiddleRight() {
        return middleRight;
    }

    public Anchor getBottomLeft() {
        return bottomLeft;
    }

    public Anchor getBottomMiddle() {
        return bottomMiddle;
    }

    public Anchor getBottomRight() {
        return bottomRight;
    }
    
    
    @Override
    public void movePosition(float dx, float dy) {
        if(alignment == Alignment.HORISONTAL)
        {
            p.add(dx, 0);
            for(int i = 0; i < anchorList.size(); i++)
            {
                anchorList.get(i).add(dx, 0);
            }
        }
        else
        {
            p.add(0, dy);
            for(int i = 0; i < anchorList.size(); i++)
            {
                anchorList.get(i).add(0, dy);
            }
        }
        setVelosity(0, 0);
    }

    @Override
    public boolean isClicked(int pixelX, int pixelY, float zoom) {
        Rectangle rect = new Rectangle((p.x - width / 2) * zoom, (p.y + height / 2) * zoom, width * zoom, height * zoom);
        return rect.contains(pixelX, pixelY);
    }

    @Override
    public void setPosition(float x, float y)
    {
        float dx = x - p.x;
        float dy = y - p.y;

        p.x = x;
        p.y = y;
        
        for(int i = 0; i < anchorList.size(); i++)
        {
            anchorList.get(i).add(dx, dy);
        }
    }
    
    public void init(float x, float y) {
        setPosition(x, y);
        setVelosity(0, 0);
    }
    
    
    public static void main(java.lang.String[] argv)
    {
        float DEFAULT_MAX_TURN_RATE = 0.01f;
        float speed = 30;
        
        System.out.println(speed/DEFAULT_MAX_TURN_RATE);
    }

    @Override
    public java.lang.String toString() {
        return "Mass " + mass * 1000 + " g";
    }
    
    
}
