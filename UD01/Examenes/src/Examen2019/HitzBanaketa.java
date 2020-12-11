package Examen2019;


import java.util.Arrays;

public class HitzBanaketa {

//    public static void main(String[] args) {
//        String esaldia = "nire aitak amari gona gorria ekarri";
//        String[] hitzak = new String[10];
//        String[] array = esaldia.split(" ");
//
//        String hitza = "";
//        int h; //hitzen kontadorea
//        int k; //karaktereen kontadorea
//
//        // IDATZI HEMEN ZURE KODEA    
//        for (int i = 0; i < hitzak.length; i++) {
//            if (array.length <= i) {
//                hitzak[i] = "null";
//            } else {
//                hitzak[i] = array[i];
//            }
//
//        }
//        System.out.println(Arrays.toString(hitzak));
//    }
//
//}
    
    public static void main(String[] args) {
        String esaldia = "nire aitak amari gona gorria ekarri";
        String[] hitzak = new String[10];

        String hitza = "";
        int h = 0; //hitzen kontadorea
        int k = 0;//karaktereen kontadorea

        // IDATZI HEMEN ZURE KODEA    
        while (k < esaldia.length()) {

            if (esaldia.charAt(k) == ' ') {
                hitzak[h] = hitza;
                hitza = "";
                h++;

            } else {
                hitza = hitza + esaldia.charAt(k);
            }
            k++;
        }
        hitzak[h] = hitza;
        System.out.println(Arrays.toString(hitzak));
    }

}
