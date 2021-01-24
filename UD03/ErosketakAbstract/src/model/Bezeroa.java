/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazg
 */
public abstract class Bezeroa {

    private int kodea;
    private String helbidea;

    public Bezeroa(int kodea, String helbidea) {
        this.kodea = kodea;
        this.helbidea = helbidea;
    }



    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public abstract String getIzena();
    public abstract String getEmaila();
    
}
