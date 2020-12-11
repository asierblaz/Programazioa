/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class HiruLaukiSortu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Laukia l1 = new Laukia(5, 1);
        Laukia l2 = new Laukia(6, 2);
        Laukia l3 = new Laukia(2, 2);

        System.out.println("Hiru lauki imprimatu dituzu:\n"
                + l1.toString() + "\n"
                + l2.toString() + "\n"
                + l3.toString() + "\n");
        
        
        System.out.println(l1.getMota());
    }
}
