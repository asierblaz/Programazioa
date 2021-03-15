package exekutagarriak;

import java.util.Arrays;
import model.SQLiteKudeatu;
import model.SQLiteKudeatuBi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class ProgramaNagusia {

    public static void main(String[] args) {

        String s="";
        
       String euskera= SQLiteKudeatu.euskaraBilatu("ratson");
       
       if (euskera.equals(s)){
           System.out.println("f");
       
       }
       
    }
}
