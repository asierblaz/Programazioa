/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author blazg
 */
public class BorrarArray {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      ArrayList<Jokalaria> jokalariak = new ArrayList<>();

        jokalariak.add(new Jokalaria("ASIER", -30, "2"));
        
       

        FileOutputStream fout = new FileOutputStream("src/resources/output.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(jokalariak);
        out.close();

        FileInputStream fin = new FileInputStream("src/resources/output.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        ArrayList<Jokalaria> jokalariak2 = (ArrayList<Jokalaria>) ois.readObject();
      
        
        System.out.println(jokalariak2);
        System.out.println("ordenado");
       
        
        System.out.println(jokalariak2);
        
        
        

    }
}
