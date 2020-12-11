
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Laukia l1 = new Laukia(3, 5);
        Laukia l2 = new Laukia(8, 10);

        System.out.println(l1.isBiggerThan(l2));

        System.out.println("Laukiak ordenatu gabe");
        Laukia[] laukiak = {new Laukia(8, 5), new Laukia(6, 2), new Laukia(1, 3), new Laukia(10, 1), new Laukia(4, 5), new Laukia(5, 5), new Laukia(9, 2)};
        System.out.println(Arrays.toString(laukiak));

        Laukia.ordenatu(laukiak);
        System.out.println("Laukiak ordenatuta");
        System.out.println(Arrays.toString(laukiak));
    }

}
