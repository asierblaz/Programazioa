package obejctfiles;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Irakurri {

    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("AsierrenLagunak.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Laguna l;
            while (true) {
                l = (Laguna) inStream.readObject(); //
                System.out.println(l);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {
            System.out.println("Ez dago objektu gehiagorik.");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                Logger.getLogger(Irakurri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}