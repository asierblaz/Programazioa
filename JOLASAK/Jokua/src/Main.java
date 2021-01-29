
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
public class Main {

    public static void main(String[] args) {
        Marrazkia m1 = new Marrazkia(1, "CASA");
        System.out.println(m1.getId());
        System.out.println(m1.getIzena());
        System.out.println(m1.getLetraZenbakia());
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu hitz bat");
        
        String palabra = in.next();
        
        if (palabra.equals(m1.getIzena())){
            System.out.println("las palabras coinciden");
        } else{
            System.out.println("las palabras no coinciden");
        }
    }

}
