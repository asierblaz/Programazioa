/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static java.lang.System.in;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
 *  * EUSKAL SELEKZIOA * ---------------------------------- * 1. Partaideen
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
        arrayBete();
        System.out.println("");

        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************\n"
                + "*    EUSKAL SELEKZIOA\n"
                + "*  ----------------------------------\n"
                + "*  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)\n"
                + "*  2. Partaideen datuak ikusi taldekatuta\n"
                + "*  3. Futbolariak alfabetikoki inprimatu\n"
                + "*  4. Aldaketa ( Sartu zaitez zu be0ste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)\n"
                + "*  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)\n"
                + "*  6.Irten\n\n"
                + "*  Aukeratu zenbaki bat\n\n"
                + "*  **************************************************************"
        );

        int n = in.nextInt();

        while (n != 6) {

            if (n == 1) {

                datuakIkusi();

            }
            if (n == 2) {
                datuakTaldekatuta();
            }

            if (n == 3) {
                alfabetikokiImprimatu();
            }

            if (n == 4) {
                aldaketak();
            }
            if (n == 5) {
                bilatu();
            }
            System.out.print("\nAukeratu zenbaki bat ");
            n = in.nextInt();

        }
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");

    }

    public static void arrayBete() {
        azkenId = 0;

        selekzioa.add(new Futbolista(azkenId++, "Aitor", "Fernandez", 29, 1, "POR"));
        selekzioa.add(new Futbolista(azkenId++, "Unai", "Bustinza", 28, 2, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Mikel", "Balenziaga", 28, 3, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Asier", "Illaramendi", 28, 4, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Iñigo", "Martinez", 30, 5, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Mikel", "San Jose", 31, 6, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Gaizka", "Larrazabal", 23, 8, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Javier", "Eraso", 30, 10, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Asier", "Villalibre", 23, 11, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Ahien", "Muñoz", 23, 12, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Iago", "Herrerin", 32, 13, "POR"));
        selekzioa.add(new Futbolista(azkenId++, "Aritz", "Elustondo", 26, 14, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Jesus", "Areso", 21, 15, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Iñigo", "Vicente", 23, 16, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Daniel", "Vivian", 21, 17, "DEL"));

        selekzioa.add(new Entrenador("Mister", azkenId, "Javier", "Clemente", 51));
        selekzioa.add(new Entrenador("adjunto", azkenId, "Joseba", "Nuñez", 51));
        selekzioa.add(new Entrenador("Porteros", azkenId, "Markel", "Lautadahandi", 41));

        selekzioa.add(new Masajista("Fisio", 35, azkenId, "Iñaki", "Sertxiberrieta", 48));

        selekzioa.add(new IntegranteSeleccion(azkenId, "Ander", "Etxeburu", 57));

    }

    public static void datuakIkusi() {

        System.out.println("Hauek dira Euskal selekzioaren Jokalariak");

        for (IntegranteSeleccion integrante : selekzioa) {

            System.out.println(integrante);
            System.out.println("");

        }

    }

    public static void datuakTaldekatuta() {
        ArrayList<IntegranteSeleccion> futbolistas = new ArrayList<>();
        ArrayList<IntegranteSeleccion> entrenadores = new ArrayList<>();
        ArrayList<IntegranteSeleccion> masajistas = new ArrayList<>();
        ArrayList<IntegranteSeleccion> integrantes = new ArrayList<>();

        for (IntegranteSeleccion integrante : selekzioa) {

            if (integrante instanceof Futbolista) {
                futbolistas.add(integrante);
            } else if (integrante instanceof Entrenador) {
                entrenadores.add(integrante);
            } else if (integrante instanceof Masajista) {
                masajistas.add(integrante);
            } else {
                integrantes.add(integrante);
            }

        }

        System.out.println("**********Futbolariak:*********\n");

        for (IntegranteSeleccion integrante : futbolistas) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("******************************************************************");

        System.out.println("**********Entrenatzaileak:*********\n");

        for (IntegranteSeleccion integrante : entrenadores) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("******************************************************************");

        System.out.println("**********Masajistak:*********\n");

        for (IntegranteSeleccion integrante : masajistas) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("******************************************************************");

        System.out.println("**********Integranteak:*********\n");

        for (IntegranteSeleccion integrante : integrantes) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("******************************************************************");

    }

    public static void alfabetikokiImprimatu() {
        Collections.sort(selekzioa, new Comparator<IntegranteSeleccion>() {

            public int compare(IntegranteSeleccion jok1, IntegranteSeleccion jok2) {

                return jok1.getNombre().compareTo(jok2.getNombre());

            }

        });
        
        
        //imprimatu
        for (IntegranteSeleccion integrante : selekzioa) {
            System.out.println(integrante.getNombre());
        }
    }

    public static void aldaketak() {

        System.out.print("Zein aterako da futbol zelaitik? ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();

        int i = 0;
        boolean encontrado = false;
        while (i < selekzioa.size() && encontrado == false) {
            if (id == selekzioa.get(i).getId()) {
                System.out.print("Sartu Jokalari berriaren datuak: ");
                System.out.print("Izena :");
                String izena = in.next();
                System.out.print("Abizena :");
                String abizena = in.next();
                System.out.print("Adina : ");
                int adina = in.nextInt();
                System.out.print("Dorsal: ");
                int dorsal = in.nextInt();
                System.out.print("Posizioa: ");
                String pos = in.next();
                selekzioa.set(id, new Futbolista(id, izena, abizena, adina, dorsal, pos));
                System.out.println("hola");
                encontrado = true;
            }
            i++;
        }
        if (encontrado == false) {
            System.out.println("Jokalaria ez dago jolasten");
        }
        datuakTaldekatuta();

    }

    public static void bilatu() {
        Scanner in = new Scanner(System.in);

        System.out.print("Sartu Jokalari berriaren datuak: ");
        System.out.print("Abizena :");
        String abizena = in.next();
        int i = 0;
        boolean encontrado = false;

        while (i < selekzioa.size() && encontrado == false) {

            if (abizena.equals(selekzioa.get(i).getApellidos())) {
                System.out.println("ID = " + selekzioa.get(i).getId());
                System.out.println("Izena = " + selekzioa.get(i).getNombre());
                System.out.println("Abizena = " + selekzioa.get(i).getApellidos());
                System.out.println("Adina = " + selekzioa.get(i).getEdad());
                //System.out.println("Dorsal= "+ selekzioa.get(i));
                encontrado = true;
            }
            i++;

        }
        if (encontrado == false) {
            System.out.println("Jokalaria ez dago jolasten");
        }
    }
}
