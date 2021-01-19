/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author blazquez.asier
 */
public class EpekakoErosketa extends Erosketa {

    private int epeak;
    private boolean ordainketaBukatua;
    private double kuota;

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, double guztira, double kuota) {
        
        
    
        super(kodea,eroslea,guztira);
        super.data= LocalDate.parse(data);
        this.epeak = 12;
        this.ordainketaBukatua = false;
        this.kuota = kuota;
    }

    public double gainetikOrdainduBeharrekoa(){return 0;} // gainetik ordaindu beharrekoa kenekta bat egitea
 
}
