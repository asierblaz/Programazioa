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
public class MyRectangle {

    MyPoint topLeft;
    MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getPerimetroa() {
        double altuera = topLeft.getY() - bottomRight.getY();
        double zabalera = bottomRight.getX() - topLeft.getX();
        return 2 * altuera + 2 * zabalera;

    }

    public double getAzalera() {
        double altuera = topLeft.getY() - bottomRight.getY();
        double zabalera = bottomRight.getX() - topLeft.getX();
        return altuera * zabalera;
    }

    @Override
    public String toString() {
        return "Rectangle " +  topLeft +  bottomRight ;
    }
    
    
}
