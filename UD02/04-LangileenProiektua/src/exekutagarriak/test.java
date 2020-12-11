/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;

/**
 *
 * @author blazquez.asier
 */
public class test {
    
    public static void main(String[] args) {
        
        Langilea[] langileak = Langilea.nireHamarLagunLangile();
        
        System.out.println(Langilea.bilatu("Jon", Langilea.nireHamarLagunLangile()));
        
      //  System.out.println(Langilea.bilatu("Leo", langileak));
        
        System.out.println( Langilea.bilatu("8", "id", langileak));   
    
    
    }
}
