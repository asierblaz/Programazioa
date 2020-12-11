
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
/* Zenbaki bat sartzen dugu, positiboa bada aztertuko du bakoitia edo bikoitia den eta handia (100 baino handiagoa bada)
edo txikia den( 101 baino txikiagoa bada) zenbakia negatiboa bada zenbakia ezegokia dela bueltatuko du

 */
public class ZenbakiaSailkatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        int zenbakia;
        System.out.print("Sartu zenbaki oso positibo bat ");
        zenbakia = in.nextInt();

        while (zenbakia > 0) {

            if (zenbakia > 100) {
                if (zenbakia % 2 == 0) {
                    System.out.println("Sartu duzun zenbaki handia bikoitia da");

                } else {
                    System.out.println("Sartu duzun zenbaki handia bakoitia da");

                }

            }
            if (zenbakia <= 100) {
                if (zenbakia % 2 == 0) {
                    System.out.println("Sartu duzun zenbaki txikia bikoitia da");

                } else {
                    System.out.println("Sartu duzun zenbaki txikia bakoitia da");

                }
            }
            System.out.print("Sartu zenbaki oso positibo bat ");
            zenbakia = in.nextInt();
        }

        System.out.println("Zenbaki ezegokia");

    }
}
