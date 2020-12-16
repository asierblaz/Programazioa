/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Arrays;
import model.*;

/**
 *
 * @author blazquez.asier
 */
public class ArrayakEtaArrayListak {

    public static void main(String[] args) {
        /*    - Hiru triangelu gordeko dituen arraya sortu, bete eta inprimatu
    - Lau laukizuzen gordeko dituen ArrayLista sortu, bete eta inprimatu*/

        MyTriangle[] triangeluak = new MyTriangle[3];
        ArrayList<MyRectangle> laukiak = new ArrayList<MyRectangle>();
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            laukiak.add(new MyRectangle(new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9)), new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9))));
            if (cont < 3) {
                triangeluak[i] = new MyTriangle(new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9)), new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9)), new MyPoint((int) (Math.random() * 9), (int) (Math.random() * 9)));
                cont++;
            }
        }

        System.out.println(Arrays.toString(triangeluak));
        System.out.println(laukiak);

    }
}
