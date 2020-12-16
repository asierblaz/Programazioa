/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.MyPoint;
import model.MyTriangle;
import model.MyRectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blazquez.asier
 */
public class JUnitTesta {
    
    public JUnitTesta() {
    }    @Test
    public void testAzaleraPass() {
        assertEquals("Azalera metodoa gaizki", (int) (new MyRectangle(new MyPoint(-5, 1), new MyPoint()).getAzalera()), 5);

    }

    @Test
    public void testGetTypePass() {
        assertEquals("Mota txarto kalkulatua", new MyTriangle(0, 16, -3, 12, 3, 12).getType(), "isoszelea");
        assertEquals("Mota txarto kalkulatua", new MyTriangle(new MyPoint(0,1),new MyPoint(4,1),new MyPoint(0,4)).getType(), "eskalenoa");
    }
    
        @Test
    public void testGetPerimetroaPass() {
        assertEquals("Triangeluaren Perimetroa txarto kalkulatua", (int)new MyTriangle(0, 16, -3, 12, 3, 12).getPerimeter(), 16);
        assertEquals("Triangeluaren Perimetroa txarto kalkulatua",0,(Double.compare(new MyTriangle(new MyPoint(0,1),new MyPoint(4,1),new MyPoint(0,4)).getPerimeter(),12.0)));
    }
}
