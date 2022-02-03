/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package phy1061lab2;

/**
 *
 * @author fes77
 */
public interface Movable {
    public void movePosition(float dx, float dy);
    public boolean isClicked(int pixelX, int pixelY, float zoom);
    public void setPosition(float x, float y);
}
