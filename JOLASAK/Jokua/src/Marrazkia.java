/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Marrazkia {
    private int id;
    private String izena;
    //ruta imagen
    private int letraZenbakia;
    
    public Marrazkia(int id, String izena) {
        this.id = id;
        this.izena = izena;
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public int getLetraZenbakia() {
        
       
        return  izena.length();
    }
    
    
    
    
    
    
    
}
