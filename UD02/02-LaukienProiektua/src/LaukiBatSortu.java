
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class LaukiBatSortu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Laukia l1;
        char pintzela = '*';
        int altuera,zabalera;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu laukiaren zabalera:");
      
        zabalera=in.nextInt();
        System.out.print("Sartu laukiaren altuera:");
        altuera=in.nextInt();
        
        l1 = new Laukia(zabalera,altuera);
        
        System.out.print("Lauki " + l1.getMota() + " sortu duzu: => " + l1.toString());

        System.out.println("Hona hemen marrazkia beteta");
        l1.marraztuBeteta();
        
        System.out.println("Hona hemen marrazkia Hutsik");
        l1.marraztuHutsik();

    }
}
