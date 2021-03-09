package model;

import besteak.AppendingObjectOutputStream;
import exekutagarriak.hiztegiaSortu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class FKudeatu {

    private static String archivo = "hiztegia.dat";

    public FKudeatu() {
    }

    public static String getArchivo() {
        return archivo;
    }

    public static void setArchivo(String archivo) {
        FKudeatu.archivo = archivo;
    }

    public static Terminoa tBilatu(String hitza) throws FileNotFoundException, IOException, ClassNotFoundException {
        hitza = hitza.toLowerCase();
        FileInputStream fin = null;
        fin = new FileInputStream(archivo);
        ObjectInputStream inStream = new ObjectInputStream(fin);
        Terminoa t;
        while (true) {
            t = (Terminoa) inStream.readObject(); //
            if (t.getEuskara().equals(hitza) || t.getGaztelera().equals(hitza)) {

                return t;

            }

        }

    }

    public static String tImprimatu() throws FileNotFoundException, IOException, ClassNotFoundException {
        String s = "";
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(archivo);
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa t;
            while (true) {
                t = (Terminoa) inStream.readObject(); //
                s = s + t.toString();
            }
        } catch (FileNotFoundException ex) {
            s = "Fitxategia ez dago bere lekuan.";
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {
            s = "ClassNotFound Salbuespena gertatu da.";
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                Logger.getLogger(hiztegiaSortu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return s;
    }

    public static ArrayList<Terminoa> arrayItzuli() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Terminoa> terminoak = new ArrayList<>();

        FileInputStream fin = null;
        try {
            fin = new FileInputStream(archivo);
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa t;
            while (true) {
                t = (Terminoa) inStream.readObject(); //
                terminoak.add(t);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                Logger.getLogger(hiztegiaSortu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return terminoak;
    }

    public static void tGehitu(Terminoa t) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(archivo, true);
            AppendingObjectOutputStream out = new AppendingObjectOutputStream(fout);
            out.writeObject(t);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FKudeatu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(FKudeatu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
