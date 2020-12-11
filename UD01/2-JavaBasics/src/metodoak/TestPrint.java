/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import static metodoak.ArrayToString.arrayToString;

/**
 *
 * @author blazquez.asier
 */
public class TestPrint {

    public static void main(String[] args) {
        int[] arrai1 = { 6, 5, 48, 10 };
        int[] arrai2 = { };
        int[] arrai3 = { 4 };
        double[] arrai4 = { 6.5, 4.2 } ;
        float[] arrai5 = { 6.3f, 4.1f, 5.0f } ;
       
        System.out.println("print() metodoei deituta:\n============================");
        Print.print(arrai1);
        Print.print(arrai2);
       Print.print(arrai3);
       Print.print(arrai4);
       Print.print(arrai5);
        
        System.out.println("\narrayToString() metodoari deituta:\n====================================");
        System.out.println(arrayToString(arrai1));
        System.out.println(arrayToString(arrai2));
        System.out.println(arrayToString(arrai3));
        
    }


}