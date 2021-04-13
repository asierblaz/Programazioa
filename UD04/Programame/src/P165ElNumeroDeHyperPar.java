
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
public class P165ElNumeroDeHyperPar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println(par(n));
        
    }

    public static String par(int n) {

        String num = n + "";
        boolean encontrado = true;
        int i = 0;
        while (i < num.length() && encontrado) {

            n = Integer.parseInt(num.charAt(i) + "");

            encontrado = n % 2 == 0;

        }
        if (encontrado) {
            return "SI";
        } else {
            return "NO";
        }
    }
}
