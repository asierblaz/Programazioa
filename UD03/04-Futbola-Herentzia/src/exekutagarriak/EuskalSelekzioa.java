package exekutagarriak;

import java.util.ArrayList;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/**
 * Programa honetan Euskal Selekzioko datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *
 *
 */
public class EuskalSelekzioa {

    public static int azkenId = 0;
    static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        Futbolista villalibre = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11, "DEL");
        azkenId = azkenId + 1;
        System.out.println(villalibre);
        villalibre.entrenar();
        System.out.println("");

    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko
     * objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {
        Entrenador clemente = new Entrenador("clementeMister", azkenId, "Javier", "Clemente", 51);
        azkenId++;
        System.out.println(clemente);
        clemente.concentrarse();
        clemente.viajar();
        System.out.println("");
        Masajista inaki = new Masajista("Fisio", 35, azkenId, "Iñaki", "Sertxiberrieta", 48);
        azkenId++;
        System.out.println(inaki);
        inaki.concentrarse();
        inaki.viajar();
        System.out.println("");
        IntegranteSeleccion ander = new IntegranteSeleccion(azkenId, "Ander", "Etxeburu", 57);
        azkenId++;
        System.out.println(ander);
        ander.viajar();
        ander.concentrarse();

    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    public static void selekzioOsoaSortu() {
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

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko
     * du
     *
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int id) {
        boolean borrado = false;

        for (int i = 0; i < selekzioa.size(); i++) {

            if (selekzioa.get(i).getId() == id) {
                selekzioa.remove(i);
                borrado = true;
            } else {
                borrado = false;
            }
        }
        System.out.println(selekzioa);
        return borrado;
    }

}
