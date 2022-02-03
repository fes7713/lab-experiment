/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phy1061lab2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fes77
 */
public class Pulley  implements Drawable{
    Position center;
    float diameter;
    
    Anchor top;
    Anchor bottom;
    Anchor left;
    Anchor right;
    
    List<Anchor> anchorList;
    
    
    float strokeSize = 0.01f;
    
    public Pulley(Position center, float diameter) {
        this.anchorList = new ArrayList<>();
        this.center = center;
        this.diameter = diameter;
        
        top = new Anchor(center.x, center.y - diameter / 2);
        bottom = new Anchor(center.x, center.y + diameter / 2);
        left = new Anchor(center.x - diameter / 2, center.y);
        right = new Anchor(center.x + diameter / 2, center.y);
        
        anchorList.add(top);
        anchorList.add(bottom);
        anchorList.add(left);
        anchorList.add(right);
    }

    public Anchor getTop() {
        return top;
    }

    public Anchor getBottom() {
        return bottom;
    }

    public Anchor getLeft() {
        return left;
    }

    public Anchor getRight() {
        return right;
    }

    @Override
    public void draw(Graphics2D g2d, float zoom) {
        float sqrt2th = 0.7071f;
        
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((int)(strokeSize * zoom)));
        g2d.drawOval((int)((center.x - diameter / 2f) * zoom), (int)((center.y - diameter / 2f) * zoom), (int)(diameter * zoom), (int)(diameter * zoom));
        g2d.drawOval((int)((center.x - diameter / 8f) * zoom), (int)((center.y - diameter / 8f) * zoom), (int)(diameter / 4f * zoom), (int)(diameter / 4f * zoom));
        
        g2d.drawLine((int)((center.x - diameter / 2f * sqrt2th) * zoom), (int)((center.y - diameter / 2f * sqrt2th) * zoom), (int)((center.x - diameter / 8f * sqrt2th) * zoom), (int)((center.y - diameter / 8f * sqrt2th) * zoom));
        g2d.drawLine((int)((center.x - diameter / 2f * sqrt2th) * zoom), (int)((center.y + diameter / 2f * sqrt2th) * zoom), (int)((center.x - diameter / 8f * sqrt2th) * zoom), (int)((center.y + diameter / 8f * sqrt2th) * zoom));
        g2d.drawLine((int)((center.x + diameter / 2f * sqrt2th) * zoom), (int)((center.y - diameter / 2f * sqrt2th) * zoom), (int)((center.x + diameter / 8f * sqrt2th) * zoom), (int)((center.y - diameter / 8f * sqrt2th) * zoom));
        g2d.drawLine((int)((center.x + diameter / 2f * sqrt2th) * zoom), (int)((center.y + diameter / 2f * sqrt2th) * zoom), (int)((center.x + diameter / 8f * sqrt2th) * zoom), (int)((center.y + diameter / 8f * sqrt2th) * zoom));
        
        g2d.setStroke(new BasicStroke(1));
        
        
        for(int i = 0; i < anchorList.size(); i++)
        {
            anchorList.get(i).draw(g2d, zoom);
        }
    }
    
}
