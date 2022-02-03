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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author fes77
 */
public class Photogate implements Drawable, Movable, Updatable{
    PHY1061Lab2 lab;
    Position p;
//    Map<Mass, List<Float>> dataMap;
    Mass m;
    List<Float> timeList;
    
    float width = 0.1f;
    float height = 0.1f;

    public Photogate(PHY1061Lab2 lab, Position p, Mass mass) {
        this.lab = lab;
        this.p = p;
        timeList = new ArrayList<>();
        m = mass;
    }
    
    public Photogate(PHY1061Lab2 lab, Position p, Mass... massList ) {
        this.lab = lab;
        this.p = p;
    }

    @Override
    public void draw(Graphics2D g2d, float zoom) {
        float radius = 0.02f;
        g2d.setColor(Color.RED);
        g2d.drawLine((int)(p.x * zoom), (int)(p.y * zoom), (int)(p.x * zoom), (int)((p.y + height * 5) * zoom));
        g2d.fillOval((int)((p.x - radius / 2) * zoom), (int)((p.y + height / 2 - radius / 2) * zoom), (int)(radius * zoom), (int)((radius) * zoom));
        
        g2d.setColor(Color.BLACK);
        g2d.fillRect((int)((p.x - width / 2) * zoom), (int)((p.y - height / 2) * zoom), (int)(width * zoom), (int)((height) * zoom));
        
        g2d.setFont(new Font("Serif", Font.PLAIN, 18));
        FontMetrics metrics = g2d.getFontMetrics(g2d.getFont());
        int hgt = (int)(metrics.getHeight() * 1.2);
        
        StringBuilder sb = new StringBuilder();
        if(!timeList.isEmpty())
        {
            sb.append(m.toString()).append("\n");
            for(int i = 0; i < timeList.size(); i++)
                sb.append("t").append(i).append("=").append(timeList.get(i)).append("\n");
            if(timeList.size() == 2)
            {
                sb.append("V =").append(getSpeed()).append("\n");
                sb.append("Tavg =").append(getAverageTime()).append("\n");
                sb.append("deltaT =").append(getTimeDifference()).append("\n");

            }
                
        }
       
        
        java.lang.String message = sb.toString();
        java.lang.String[] strList = message.split("\n");
        
        
        for(int i = 0; i < strList.length; i++)
        {
            g2d.drawString(strList[i], (int)((p.x - width / 2f) * zoom), (int)((p.y - height / 2) * zoom) - hgt * (strList.length - i));
        }
    }
    
    public void update(float deltatime)
    {
        Anchor left = m.getTopLeft();
        Anchor right = m.getTopRight();
        if(left.x < p.x && p.x < right.x)
            System.out.println("Yes");
        if(timeList.isEmpty())
        {
            if(left.x < p.x && p.x < right.x)
                timeList.add(lab.getTime());
        }
        else if(timeList.size() == 1)
        {
            if(left.x > p.x || right.x < p.x)
                timeList.add(lab.getTime());
        }
    }
    
    public Position getPosition()
    {
        return p;
    }
    
    public float getSpeed()
    {
        if(timeList.size() == 2)
            return m.getWidth() / (timeList.get(1) - timeList.get(0));
        return 0;
    }
    
    public float getTimeDifference()
    {
        if(timeList.size() == 2)
            return timeList.get(1) - timeList.get(0);
        return 0;
    }
    
    public float getAverageTime()
    {
        if(timeList.size() == 2)
            return (timeList.get(1) + timeList.get(0)) / 2;
        return 0;
    }
    
    public void init()
    {
        timeList.clear();
    }
    
    @Override
    public void movePosition(float dx, float dy) {
        p.add(dx, 0);
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
