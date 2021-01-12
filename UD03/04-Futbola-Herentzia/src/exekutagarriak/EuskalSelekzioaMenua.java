/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import java.util.Scanner;
import model.Masajista;

/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da,
 * datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez
 * dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 *
 * Gero, horrelako menu bat agertuko zaigu:
 *
 *  **********************************************************
 *  * EUSKAL SELEKZIOA * 
 * ---------------------------------- * 
 * 1. Partaideen
 * datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak:
 * 23 Entren...) * 2. Partaideen datuak ikusi taldekatuta * 3. Futbolariak
 * alfabetikoki inprimatu * 4. Aldaketa ( Sartu zaitez zu beste partaide baten
 * ordez. Horretarako ArrayList-en set metodoa erabiliz) * 5. Bilatu abizenetik
 * (String-en startsWith() metodoa erabiliz adibidez) * z. Irten
 *
 *  * Aukeratu zenbaki bat:
 *
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("");

        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************\n"
                + "*    EUSKAL SELEKZIOA\n"
                + "*  ----------------------------------\n"
                + "*  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)\n"
                + "*  2. Partaideen datuak ikusi taldekatuta\n"
                + "*  3. Futbolariak alfabetikoki inprimatu\n"
                + "*  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)\n"
                + "*  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)\n"
                + "*  6.Irten\n\n"
                + "*  Aukeratu zenbaki bat\n\n"
                + "*  **************************************************************"
        );

      int n = in.nextInt();

        while (n != 6) {

            if (n == 1) {

            }
            if (n == 2) {

            }

            if (n == 3) {

            }

            if (n == 4) {

            }
            if (n == 5) {

            }
            System.out.print("\nAukeratu zenbaki bat ");
            n = in.nextInt();

        }
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");

    }
}
