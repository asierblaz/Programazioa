/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import model.Bezeroa;
import model.Elikagaia;
import model.Enpresa;
import model.EpekakoErosketa;
import model.Erosketa;
import model.EtxetresnaElektrikoa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author blazquez.asier
 */
public class test {
    
    
    private static ArrayList<Bezeroa> bezeroak;
    private static ArrayList<Produktua> katalogoa;
    private static ArrayList<Erosketa> erosketak;

    
    public static void main(String[] args) {
          Produktua mesa = new Elikagaia("asd", "mesa", 50.0, true);
    
        System.out.println(mesa.getStrKodea());
        
        System.out.println(mesa.isArduratsua());
        
        Produktua  etxea = new EtxetresnaElektrikoa("abc", "casa", 80, "A++");
        
        System.out.println(etxea.getStrKodea());
        
        System.out.println(etxea.isArduratsua());
        
        initialize();
        
        System.out.println( Produktua.getProduktua(katalogoa, "5888748787"));
   
    }
    public static void initialize() {

        bezeroak = new ArrayList<>();
        bezeroak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus"));
        bezeroak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));

        String[] emailak = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
        bezeroak.add(new Enpresa(3, "IES Uni BHI", "Uni Eibar-Ermua", "Otaola Hiribidea 29, Eibar", emailak));

        katalogoa = new ArrayList<>();
        katalogoa.add(new EtxetresnaElektrikoa("001", "LG Hozkailua", 1450, "A+"));
        katalogoa.add(new EtxetresnaElektrikoa("002", "Fagor Hozkailua", 1200, "A+++"));
        katalogoa.add(new EtxetresnaElektrikoa("003", "AEG Garbigailua", 1300, "A+"));
        katalogoa.add(new EtxetresnaElektrikoa("004", "Fagor Labea", 850, "A"));
        katalogoa.add(new Elikagaia("101", "Idiazabal Gazta", 22, true));
        katalogoa.add(new Elikagaia("102", "Langostinoak", 25, false));
        katalogoa.add(new Elikagaia("103", "Atun Lata", 7, false));

        erosketak = new ArrayList<>();

        ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "102"));
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();
        lehenErosketaUnitateak.add(2);
        lehenErosketaUnitateak.add(1);
        lehenErosketaUnitateak.add(4);
        erosketak.add(new Erosketa("E20-01", "2020-09-25", bezeroak.get(1), lehenErosketaProduktuak, lehenErosketaUnitateak, 185));

        ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();
        bigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "004"));
        ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();
        bigarrenErosketaUnitateak.add(2);
        erosketak.add(new Erosketa("E20-02", "2020-10-24", bezeroak.get(0),
                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 1700));

        ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();
        hirugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        hirugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();
        hirugarrenErosketaUnitateak.add(10);
        hirugarrenErosketaUnitateak.add(10);
        erosketak.add(new Erosketa("E20-03", "2020-11-09", bezeroak.get(0),
                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 290));

        ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "001"));
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "003"));
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "004"));
        ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();
        laugarrenErosketaUnitateak.add(10);
        laugarrenErosketaUnitateak.add(10);
        laugarrenErosketaUnitateak.add(10);
        erosketak.add(new EpekakoErosketa("E21-01", "2021-01-07",
                bezeroak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 36000, 2000));

        ArrayList<Produktua> bostgarrenErosketaProduktuak = new ArrayList<>();
        bostgarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "002"));
        ArrayList<Integer> bostgarrenErosketaUnitateak = new ArrayList<>();
        bostgarrenErosketaUnitateak.add(1);
        erosketak.add(new Erosketa("E21-02", "2021-01-17", bezeroak.get(2),
                bostgarrenErosketaProduktuak, bostgarrenErosketaUnitateak, 1200));

        ArrayList<Produktua> seigarrenErosketaProduktuak = new ArrayList<>();
        seigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        seigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        ArrayList<Integer> seigarrenErosketaUnitateak = new ArrayList<>();
        seigarrenErosketaUnitateak.add(5);
        seigarrenErosketaUnitateak.add(10);
        erosketak.add(new Erosketa("E21-03", "2021-01-18", bezeroak.get(2),
                seigarrenErosketaProduktuak, seigarrenErosketaUnitateak, 180));

     }
}
