/* 
Jatetxe batean gaudela pentsatuko dugu. 
Erabiltzaileari menuan dauzkagun postreak erakutsiko dizkiogu eta bat
aukeratzen duenenan sukaldariari bidaliko diogu mezua, ozen, maiuskulaz.
--------------------------------------------------------------------------------
Adibide bat:
--------------------------------------------------------------------------------
MENUA
=============================
1) Yogurta
2) Flana
3) Macedonia
4) Izozkia
5) Sagar pastela
6) Arroz esnea
7) Tiramisua
8) Pantxineta
9) Profiterolak txokolate beroarekin

Aukeratu ezazu postrea zenbakia idatziz: 7

BEZEROAK TIRAMISUA AUKERATU DU. 

--------------------------------------------------------------------------------
Beste adibide bat:
--------------------------------------------------------------------------------
MENUA
=============================
1) Yogurta
2) Flana
3) Macedonia
4) Izozkia
5) Sagar pastela
6) Arroz esnea
7) Tiramisua
8) Pantxineta
9) Profiterolak txokolate beroarekin

Aukeratu ezazu postrea zenbakia idatziz: 15

ZENBAKI OKERRA SARTU DUZU. POSTRE BARIK GERATU ZARA.


 */
package arrayak;

import java.util.Scanner;

public class Hiru {

    public static void main(String[] args) {

        String[] postreak = {"Yogurta", "Flana", "Macedonia",
            "Izozkia", "Sagar pastela", "Arroz esnea", "Tiramisua",
            "Pantxineta", "Profiterolak txokolate beroarekin"};
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        //bukatu ariketa 
        
        System.out.println("MENUA\n" +
"=============================");
    for (int i=0; i<postreak.length; i++){
        System.out.println((i+1)+") "+postreak[i]);
    }
        System.out.println("");
      
        
        System.out.print("Aukeratu ezazu postrea zenbakia idatziz: ");
          aukera= in.nextInt();
          if((aukera-1)>=0&&(aukera-1)<postreak.length){
          System.out.println("BEZEROAK "+postreak[aukera-1].toUpperCase()+" AUKERATU DU");
        System.out.println("");

          }else{
              System.out.println("ZENBAKI OKERRA SARTU DUZU. POSTRE BARIK GERATU ZARA");
          }
    }
    
}
