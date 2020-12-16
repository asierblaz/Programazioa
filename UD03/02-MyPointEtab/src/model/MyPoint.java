/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {x, y};

        return xy;
    }

    public double distance() {

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distance;

    }

    public double distance(MyPoint another) {

        double distance = Math.sqrt(Math.pow((this.y - another.y), 2) + Math.pow(this.x - another.x, 2));

        return distance;

    }

    public double distance(int x, int y) {

        double distance = Math.sqrt(Math.pow((this.y - y), 2) + Math.pow(this.x - x, 2));

        return distance;

    }
    
        @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
