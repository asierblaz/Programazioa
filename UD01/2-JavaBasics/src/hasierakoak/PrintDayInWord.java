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
public class PrintDayInWord {

   public static void main(String[] args) {
      int number = 0;  // Set the value of "number" here!
       System.out.println("Using switch");
       // Using swithc-if
       switch (number) {
           case 0:
               // Use == for comparison
               System.out.println( "Monday" );
               break;
           case 1:
               System.out.println("Tuesday");
               break;
           case 2:
               System.out.println("Wednesday");
               break;
           case 3:
               System.out.println("Thrusday");
               break;
           case 4:
               System.out.println("Friday");
               break;
           case 5:
               System.out.println("Saturday");
               break;
           case 6:
               System.out.println("Sunday");
               break;
           
           default:
               System.out.println("Not a valid day");
               break;
       }

 
      // Using nested-if
       System.out.println(" ");
       System.out.println("Using if");
      if (number == 0) {   // Use == for comparison
         System.out.println( "Monday" );
      } else if ( number == 1 ) {
          System.out.println("Tuesday");
      } else if ( number == 2 ) {
          System.out.println("Wednesday");
           } else if ( number == 3 ) {
          System.out.println("Thursday");
           } else if ( number == 4 ) {
          System.out.println("Friday");
           } else if ( number == 5 ) {
          System.out.println("Saturday");
           } else if ( number == 6 ) {
          System.out.println("Sunday");
           
}else{
  System.out.println("Not a valid Day");}

      }}
