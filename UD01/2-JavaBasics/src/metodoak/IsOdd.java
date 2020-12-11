/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class IsOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki bat: ");
        n = in.nextInt();

        if (isOdd(n)==true) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static boolean isOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
