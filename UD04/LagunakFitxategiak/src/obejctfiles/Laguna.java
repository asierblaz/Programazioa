package obejctfiles;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Laguna implements Serializable{
    
    private int id;
    private String izena;

    public int getZenbakia() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public Laguna(int zenbakia, String izena) {
        this.id = zenbakia;
        this.izena = izena;
    }

    @Override
    public String toString() {
        return "Laguna{" + "zenbakia=" + id + ", izena=" + izena + '}';
    }
    
    
    
}
