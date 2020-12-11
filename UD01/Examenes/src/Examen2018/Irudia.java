package Examen2018;


public class Irudia {

    public static void main(String[] args) {

        int zenbakia = 4;
        char karakterea = '@';
        laukiHorizontalaIrudikatu(6, '#');
       //laukiHorizontalaIrudikatu(zenbakia,karakterea);

    }

    public static void laukiHorizontalaIrudikatu(int neurria, char ikurra) {

        //IDATZI ZURE KODEA HEMEN
       int altuera= neurria/2;
       int zabalera=neurria;
        
        
        for (int i = 1; i <= altuera; i++) {  // alto
                
            System.out.println("");
            for (int j = 1; j <=zabalera; j++) {  // Ancho
                   
                System.out.print(ikurra);
            }
        }
    }
}
