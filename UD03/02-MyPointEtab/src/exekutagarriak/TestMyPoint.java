/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Arrays;
import model.*;

/**
 *
 * @author blazquez.asier
 */
public class TestMyPoint {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(alocattes()));

        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);

        System.out.println(p0.distance());
        System.out.println(p1.distance());
        System.out.println(p2.distance());

        ArrayList<MyPoint> puntuak = new ArrayList<MyPoint>();
        for (int i = 0; i < 5; i++) {
            puntuak.add(new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9 )));
        }
        System.out.println(puntuak);
        
        

    }

    public static MyPoint[] alocattes() {
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < 10; i++) {

            points[i] = new MyPoint(i + 1, i + 1);
        }
        return points;
    }
}
