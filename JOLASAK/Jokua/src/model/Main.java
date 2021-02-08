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

/**
 *
 * @author blazg
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      ArrayList<Jokalaria> jokalariak = new ArrayList<>();

        jokalariak.add(new Jokalaria("ASIER", 800, "2"));
       

        FileOutputStream fout = new FileOutputStream("output.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(jokalariak);
        out.close();

        FileInputStream fin = new FileInputStream("output.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        ArrayList<Jokalaria> jokalariak2 = (ArrayList<Jokalaria>) ois.readObject();
        for (Jokalaria jokalaria : jokalariak2) {
           
        }
        
        
        

    }
}
