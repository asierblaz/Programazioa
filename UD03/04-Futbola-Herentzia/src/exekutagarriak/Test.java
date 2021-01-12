/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static exekutagarriak.EuskalSelekzioa.azkenId;
import model.Entrenador;
import model.IntegranteSeleccion;
import model.Masajista;

/**
 *
 * @author blazquez.asier
 */
public class Test {
    public static void main(String[] args) {
       Entrenador clemente = new Entrenador("clementeMister", 1, "Javier", "Clemente", 51);
       
        System.out.println(clemente);
        clemente.concentrarse();
        clemente.viajar();
        clemente.dirigiEntrenamiento();
        clemente.dirigirPartido();
        System.out.println("");
        Masajista inaki = new Masajista("Fisio", 35, 2, "Iñaki", "Sertxiberrieta", 48);
       
        System.out.println(inaki);
        inaki.concentrarse();
        inaki.viajar();
        inaki.darMasaje();
        
        System.out.println("");
        IntegranteSeleccion ander = new IntegranteSeleccion(3, "Ander", "Etxeburu", 57);
        
        System.out.println(ander);
        ander.viajar();
        ander.concentrarse();
        
       
        
    }
            
}
