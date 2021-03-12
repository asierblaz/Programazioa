package exekutagarriak;

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

        SQLiteKudeatuBi.terminoakImprimatu();

        System.out.println(  SQLiteKudeatu.euskaraBilatu("manzana"));
        System.out.println(  SQLiteKudeatu.gazteleraBilatu("sagarra"));
    }
}
