
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class ZatikiBiKonparatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Satu zatikia: ");
        Zatikia zat1 = new Zatikia(in.next());
        System.out.print("Satu zatikia: ");
        Zatikia zat2 = new Zatikia(in.next());

        if (zat1.isBiggerThan(zat2)) {

            System.out.println(zat1 + ">" + zat2);
        } else if (zat1.getIzendatzailea() == zat2.getIzendatzailea() && zat1.getZenbakitzailea() == zat2.getZenbakitzailea()) {
            System.out.println(zat1 + "==" + zat2);
        } else {
            System.out.println(zat1 + "<" + zat2);
        }

    }
}
