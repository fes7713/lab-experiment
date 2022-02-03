/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phy1061lab2;

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
public class Recorder implements Drawable, Updatable{
    Photogate pg1;
    Photogate pg2;
    List<Float> speedList = new ArrayList<>();
    float acceleration;
    
    public Recorder(Photogate pg1, Photogate pg2) {
        this.pg1 = pg1;
        this.pg2 = pg2;
        acceleration = 0;
    }
    
    public void recordSpeed(float speed)
    {
        speedList.add(speed);
        if(speedList.size() == 2)
        {
            acceleration = (pg2.getSpeed() - pg1.getSpeed()) / (pg2.getAverageTime() - pg1.getAverageTime());
            speedList.clear();
        }
        
    }
    
    public void init()
    {
        acceleration = 0;
        speedList.clear();
    }
    
    public float getAcceleration()
    {
        return acceleration;
    }

    @Override
    public void draw(Graphics2D g2d, float zoom) {
        g2d.setColor(Color.BLACK);
        if(acceleration != 0)
        {
            g2d.setFont(new Font("Serif", Font.PLAIN, 18));
            FontMetrics metrics = g2d.getFontMetrics(g2d.getFont());
            int hgt = (int)(metrics.getHeight() * 1.2);
            
            float x = (pg1.getPosition().x + pg2.getPosition().x) / 2;
            float y = (pg1.getPosition().y + pg2.getPosition().y) / 2;
            int width = g2d.getFontMetrics().stringWidth("a="+acceleration);
            
            g2d.drawString("a="+acceleration, (int)((x) * zoom) - width / 2, (int)((y) * zoom));
            g2d.drawString("deltaV="+(pg2.getSpeed()- pg1.getSpeed()), (int)((x) * zoom) - width / 2, (int)((y) * zoom) + hgt);
            g2d.drawString("deltaT="+(pg2.getAverageTime() - pg1.getAverageTime()), (int)((x) * zoom) - width / 2, (int)((y) * zoom) + hgt * 2);
            
        }
    }

    @Override
    public void update(float deltatime) 
    {
        if(speedList.isEmpty())
        {
            if(pg1.getSpeed() != 0)
            {
                recordSpeed(pg1.getSpeed());
            }
        }
        else if(speedList.size() == 1)
        {
            if(pg2.getSpeed() != 0)
            {
                recordSpeed(pg2.getSpeed());
            }
        }
    }
}
