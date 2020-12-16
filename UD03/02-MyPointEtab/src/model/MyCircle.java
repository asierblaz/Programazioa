/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.BorderLayout;

/**
 *
 * @author blazquez.asier
 */
public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {

        this.center = new MyPoint(0, 0);
        this.radius = radius;
    }

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public double getArea() {

        return Math.PI * radius + radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public int[] getCenterXY() {
        int[] xy = {center.getX(), center.getY()};
        return xy;
    }

    public double getCircumference() {
        double circ = 2 * Math.PI * radius * radius;
        return circ;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;

    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.setCenterY(y);
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.setCenterY(y);
    }

    public boolean isInside(MyPoint p) {

        if (center.distance(p) > radius) {
            return false;
        } else {

            return true;
        }
    }

}
