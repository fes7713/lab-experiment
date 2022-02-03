/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phy1061lab2;

import com.badlogic.gdx.math.Vector2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;

/**
 *
 * @author fes77
 */
public class PHY1061Lab2 implements MouseMotionListener, MouseListener, ActionListener{
    Ruler r;
    Mass m1;
    Mass m2;
    String s1;
    String s2;
    Pulley p;
    Photogate pg1;
    Photogate pg2;
    Recorder re;

    JFrame frame;
    Timer timer;
    float time;
    
    private int centerX;
    private int centerY;
    private int startPressX;
    private int startPressY;
    
    private int mouseX;
    private int mouseY;
    
    private float zoom = 400;
    public static float DELTATIME = 10/1000f;
    public static float GRAVITY = 9.81f;
    
    
    public PHY1061Lab2()
    {
        timer = new Timer(10, this);
        m1 = new Mass(
                new Position(0.5f, 1),
                new Velosity(0, 0),
                new Acceleration(0, 0),
                0.21f,
                0.1f, 
                0.1f,
                Mass.Alignment.HORISONTAL);
        
        m2 = new Mass(
                new Position(2, 1.5f),
                new Velosity(0, 0),
                new Acceleration(0, 0),
                0.015f,
                0.1f, 
                0.1f,
                Mass.Alignment.VERTICAL);
        p = new Pulley(new Position(1.9f, 1f), 0.1f);
        s1 = new String(m1.getTopRight(), p.getTop());
        s2 = new String(m2.getTopLeft(), p.getRight());
        pg1 = new Photogate(this, new Position(1.05f, 0.7f), m1);
        pg2 = new Photogate(this, new Position(1.55f, 0.7f), m1);
        
        re = new Recorder(pg1, pg2);
        r = new Ruler(1.5f, new Position(1.2f, 1.1f));
        
        float accValue = m2.getMass() * GRAVITY / (m2.getMass() + m1.getMass());
        m1.setAcceleration(new Acceleration(accValue, 0));
        m2.setAcceleration(new Acceleration(0, accValue));
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(new Dimension(800, 700));
        frame.setBounds(500, 0, 1000, 800);
        JPanel panel = new JPanel()
        {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D)g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.drawString("Timer :" + Math.floor(time * 1000) / 1000f , getWidth() - 100, 50);
                m1.draw(g2d, zoom);
                m2.draw(g2d, zoom);
                s1.draw(g2d, zoom);
                s2.draw(g2d, zoom);
                r.draw(g2d, zoom);
                p.draw(g2d, zoom);
                pg1.draw(g2d, zoom);
                pg2.draw(g2d, zoom);
                re.draw(g2d, zoom);
            }
        };
        panel.setBackground(Color.GRAY);
        frame.add(panel);
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        frame.setVisible(true);
        
    }
    
    public void update()
    {
        if(m1.getPosition().x > 1.7f)
        {
            stopTimer();
            return;
        }
        time += DELTATIME;
        m1.update(DELTATIME);
        m2.update(DELTATIME);
        pg1.update(DELTATIME);
        pg2.update(DELTATIME);
        re.update(DELTATIME);
        frame.repaint();
    }
    
    public void setMass1Value(float v)
    {
        m1.setMass(v);
        float accValue = m2.getMass() * GRAVITY / (m2.getMass() + m1.getMass());
        m1.setAcceleration(new Acceleration(accValue, 0));
        m2.setAcceleration(new Acceleration(0, accValue));
        frame.repaint();
    }
    
    public void setMass2Value(float v)
    {
        m2.setMass(v);
        float accValue = m2.getMass() * GRAVITY / (m2.getMass() + m1.getMass());
        m2.setAcceleration(new Acceleration(0, accValue));
        m1.setAcceleration(new Acceleration(accValue, 0));
        frame.repaint();
    }
    
    public float getTime()
    {
        return time;
    }
    
    public void startTimer()
    {
        timer.start();
    }
    
    public void stopTimer()
    {
        timer.stop();
    }
    
    public void restart(int m1Value, int m2Value, int mCartValue, int mCarryValue)
    {
        timer.stop();
        time = 0;
        
        timer = new Timer(10, this);
        m1.init(0.5f, 1);
        m2.init(2, 1.5f);
        r.setPosition(1.2f, 1.1f);
        
        float accValue = m2.getMass() * GRAVITY / (m2.getMass() + m1.getMass());
        System.out.println(accValue);
        m1.setAcceleration(accValue, 0);
        m2.setAcceleration(0, accValue);
        pg1.init();
        pg2.init();
        re.init();
        frame.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();     
        
        centerX += e.getX() - startPressX;
        centerY += e.getY() - startPressY;
        if(r.isClicked(mouseX, mouseY, zoom))
            r.movePosition((e.getX() - startPressX)/zoom, (e.getY() - startPressY)/zoom);
        if(m1.isClicked(mouseX, mouseY, zoom))
            m1.movePosition((e.getX() - startPressX)/zoom, (e.getY() - startPressY)/zoom);
        if(m2.isClicked(mouseX, mouseY, zoom))
            m2.movePosition((e.getX() - startPressX)/zoom, (e.getY() - startPressY)/zoom);
        if(pg1.isClicked(mouseX, mouseY, zoom))
            pg1.movePosition((e.getX() - startPressX)/zoom, (e.getY() - startPressY)/zoom);
        if(pg2.isClicked(mouseX, mouseY, zoom))
            pg2.movePosition((e.getX() - startPressX)/zoom, (e.getY() - startPressY)/zoom);
        startPressX = e.getX();
        startPressY = e.getY();
        
        System.out.println("CenterX :" + centerX/zoom + " CenterY :" + centerY/zoom);
//        System.out.println("X: " + e.getX() + ", Y: " + e.getY());

        
        
        
        frame.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();   
        
        frame.repaint();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        startPressX = e.getX();
        startPressY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = -1;
        mouseY = -1;        
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
    }
    
    public static void main(java.lang.String[] args) throws InterruptedException {
        
        PHY1061Lab2 lab = new PHY1061Lab2();
//        lab.run();
        
        JFrame controlFrame = new JFrame();
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(500, 600));
        ControlePanel controlePanel = new ControlePanel(lab);
        controlFrame.add(controlePanel);
        controlFrame.setVisible(true);
    }

    
}
