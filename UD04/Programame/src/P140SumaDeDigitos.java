
import java.util.Scanner;

public class P140SumaDeDigitos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s="";
        int n = in.nextInt();
        
        while(n!=-1){
        System.out.println(sumarDigitos(n));
        n= in.nextInt();
        }
        System.out.println(s);
    }

    public static String sumarDigitos(int num) {
        String n = num + "";

        int suma = 0;
        String salida = "";

        for (int i = 0; i < n.length(); i++) {

            suma = suma + Integer.parseInt(n.charAt(i) + "");

            if (i == n.length() - 1) {
                salida = salida + n.charAt(i) + " = " + suma;

            } else {
                salida = salida + n.charAt(i) + " + ";
            }

        }
        return salida;
    }

}

