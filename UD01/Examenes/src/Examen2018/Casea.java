package Examen2018;

public class Casea {

    public static void main(String[] args) {

        System.out.println("BAT: " + caseaAldatu("EIBAR", 'm'));
        System.out.println("BI: " + caseaAldatu("ermua", 'M'));
        System.out.println("HIRU: " + caseaAldatu("Elgoibar", 'G'));
        System.out.println("LAU: " + caseaAldatu("Gaindituko dut", 'M'));

    }

    public static String caseaAldatu(String hitza, char modua) {

        String hitzAldatua = "";
        int value;
        //IDATZI HEMEN ZURE KODEA        
        if (modua == 'm') {
            // hitzAldatua = hitza.toLowerCase();
            for (int i = 0; i < hitza.length(); i++) {
                value = (int) hitza.charAt(i) + 32;
                hitzAldatua = hitzAldatua + (char) value;

            }
        }
        if (modua == 'M') {
            //  hitzAldatua = hitza.toUpperCase();
            for (int i = 0; i < hitza.length(); i++) {
                value = (int) hitza.charAt(i) - 32;
                hitzAldatua = hitzAldatua + (char) value;
            }
        }
        if (modua == 'G') {
            for (int i = hitza.length() - 1; i >= 0; i--) {
                hitzAldatua = hitzAldatua + hitza.charAt(i);

            }
        }
        return hitzAldatua;
    }
}
