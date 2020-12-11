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
public class SumAverageOddEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
      // Define variables
      int diference = 0;          // The accumulated sum, init to 0
      int lowerbound = 1;
      int upperbound = 100;
      int sumPar=0;
      int sumImpar=0;
      

      for (int number = lowerbound; number <= upperbound; ++number) {
        if(number % 2==0)
            sumPar=sumPar+number;
        else
            sumImpar=sumImpar+number;
             
      }
      
      if(sumPar<sumImpar)
          diference=sumImpar-sumPar;
      else
     diference=sumPar-sumImpar;
      
        System.out.println("Suma Par: " + sumPar);
        System.out.println("Suma Impar " + sumImpar);
        System.out.println("Diferencia " + diference);


//---------------------------------------------------------------
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average

              
   }

    }

