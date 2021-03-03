/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FKudeatu;
import model.Terminoa;

/**
 *
 * @author blazquez.asier
 */
public class hiztegiaSortu {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Terminoa t1 = new Terminoa("sagarra", "manzana");
        Terminoa t2 = new Terminoa ("fresa", "marrubia");
        Terminoa t3 = new Terminoa ("balon", "baloia");
        

       
         
          
            //Creating stream and writing the object    
            FileOutputStream fout = new FileOutputStream("hiztegia.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(t1);
            out.writeObject(t2);
            out.writeObject(t3);
            

       
        System.out.println( FKudeatu.tBilatu("manzana"));
        
        
                Terminoa t5 = new Terminoa ("raton", "xagua");
                
                FKudeatu.tGehitu(t5);
        System.out.println( FKudeatu.tBilatu("xagua"));

        
        FKudeatu.tImprimatu();
        
      
    }
}
