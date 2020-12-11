/* Programa honek array baten gorde ditugun zenbakien batuketa kalkulatu eta 
inprimatzen du... lau modu desberdinetan.

 */
package arrayak;

public class Bat {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 7, 8, 3};
        int batuketa = 0;
        int cont =0;
    //for erabilita
    
    for (int i=0; i<zenbakiak.length; i++){
    batuketa= batuketa+zenbakiak[i];

    }
        System.out.println("For erabilita emaitza: "+ batuketa);

    //while erabilita
    
    int i=0;
    batuketa =0;
    while(i<zenbakiak.length){
    batuketa= batuketa+zenbakiak[i];
    i++;
    }
   System.out.println("While erabilita emaitza: "+ batuketa);

    //do while erabilita
    i=0;
    batuketa=0;
  
    do {
         batuketa= batuketa+zenbakiak[i];
         i++;   
      }
      while ( i <zenbakiak.length );
         System.out.println("Do While erabilita emaitza: "+ batuketa);

//    //for-each erabilita
i=0;
batuketa=0;
for ( int n: zenbakiak) {
      batuketa= batuketa+zenbakiak[i];
    i++;  
    
}
   System.out.println("For Each erabilita emaitza: "+ batuketa);
    }
}
