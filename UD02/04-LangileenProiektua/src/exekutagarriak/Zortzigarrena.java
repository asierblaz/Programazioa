/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;
import model.Zatikia;

/**
 *
 * @author blazquez.asier
 */
public class Zortzigarrena {

    public static void main(String[] args) {

        Langilea[] langileak = Langilea.nireHamarLagunLangile();
        System.out.println(langileak[0].getLanaldia());

        langileak[0].setLanaldia(new Zatikia(langileak[0].getLanaldia().getZenbakitzailea(), langileak[0].getLanaldia().getZenbakitzailea() * 2));
        langileak[langileak.length - 1].setLanaldia(new Zatikia(langileak[0].getLanaldia().getZenbakitzailea(), langileak[0].getLanaldia().getZenbakitzailea() * 2));

        System.out.println(langileak[0]);
        System.out.println(langileak[langileak.length - 1]);
        System.out.println(lanaldiOsoa(langileak));
    }
    
    public static double lanaldiOsoa(Langilea[] langileak){
        
        double lanaldia=0;
        int orduak=35;
        for(int i=0;i<langileak.length;i++){
        
            lanaldia= lanaldia+langileak[i].getLanaldia().hamartarBaliokidea()*orduak;
            System.out.println(lanaldia);
        }
        
    return lanaldia;
    }

}
