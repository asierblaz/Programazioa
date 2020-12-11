package hasierakoak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int n =3;
        int nMax= 20;
        int fnMinus1=1;
        int fnMinus2=1;
        int fnMinus3=1;
        double average;
        int aux=0;
        int aux2=0;
        int sum=fnMinus1+fnMinus2+fnMinus3;
   System.out.println("The first " + nMax + " Tribonacci numbers are:");

        System.out.print(fnMinus1+ " ");
        aux =aux+fnMinus1;
        
         
        for (int i = 4; i < nMax; i++) {
             
            System.out.print(sum+" ");
            aux2=aux2+sum;
//             
//            fnMinus1 = fnMinus2;
//             fnMinus2=fnMinus3;
//             fnMinus3= sum;
//             sum = fnMinus1+ fnMinus2+ fnMinus3;
//             

             sum = fnMinus1 + fnMinus2 + fnMinus3;
             fnMinus1 = fnMinus2;
             fnMinus2=fnMinus3;
            fnMinus3= sum;
                    
            
        }
        System.out.println("");
        average= (double)(aux+aux2)/nMax;
        System.out.println("The average is "+ average);
        
    }
}
