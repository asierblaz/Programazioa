package Examen2018;

import java.util.Scanner;

public class AstekoEgunak {

    public static void main(String[] args) {
        String[][] astekoEgunak = {{"Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata", "Igandea"},
        {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"},
        {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
        };

        Scanner in = new Scanner(System.in);
        int eguna = 0;
        String idioma = "";
        //IDATZI HEMEN ZURE KODEA
        System.out.print("Aukeratu eguna(1-7): ");
        eguna = in.nextInt();
        System.out.print("Aukeratu hizkuntza (EU, ES, EN): ");
        idioma = in.next().toLowerCase();

        if (eguna >= 1 && eguna <= 7) {

            if ("eu".equals(idioma)) {

                System.out.println(astekoEgunak[0][eguna - 1]);
            }
            if ("es".equals(idioma)) {

                System.out.println(astekoEgunak[1][eguna - 1]);
            }
            if ("en".equals(idioma)) {

                System.out.println(astekoEgunak[2][eguna - 1]);

            }
            if (!"eu".equals(idioma) && !"es".equals(idioma) && !"en".equals(idioma)) {
                System.out.println("Balio okerrak sartu dituzu.");
            }

        } else {
            System.out.println("Balio okerrak sartu dituzu.");
        }
    }
}
