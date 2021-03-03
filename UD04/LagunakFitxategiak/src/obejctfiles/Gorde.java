package obejctfiles;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Gorde {
    
    
public static void main(String[] args) {
        try {
            //Creating the object    
            Laguna l1 = new Laguna(1,"Pablo");
          
            //Creating stream and writing the object    
            FileOutputStream fout = new FileOutputStream("AsierrenLagunak.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(l1);
       
            
            //closing the stream    
            //out.close();
            //System.out.println("Datuak fitxategian idatzi dira.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
