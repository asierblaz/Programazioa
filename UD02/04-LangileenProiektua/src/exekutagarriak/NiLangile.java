/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.awt.SystemColor;
import java.util.Scanner;
import model.Langilea;

/**
 *
 * @author blazquez.asier
 */
public class NiLangile {
    public static void main(String[] args) {
        
        Langilea asier = new Langilea(1, "Asier", "Blazquez", 600);
        
        System.out.println(asier);
        asier.soldataIgo(50);
        System.out.println(asier);
        
        Scanner in = new Scanner(System.in);
        System.out.print("Zenbateko igoera nahi duzu?");
        try{
         asier.soldataIgo(in.nextInt());
        }
        catch (Exception ex) {
            System.out.println("Sartu Zenbaki osoa.");
        }
                System.out.println(asier);

    }
}
