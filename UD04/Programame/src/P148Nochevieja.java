
import java.util.Scanner;


public class P148Nochevieja {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = in.next();

        while (!entrada.equals("00:00")) {
            System.out.println(horaNochevieja(entrada));
            entrada = in.next();

        }

    }

    public static int horaNochevieja(String entrada) {
        int horas = Integer.parseInt(entrada.charAt(0) + "" + entrada.charAt(1) + "");
        int minutos = Integer.parseInt(entrada.charAt(3) + "" + entrada.charAt(4) + "");
        int horasFaltan;
        int minutosFaltan;
        horasFaltan = 23 - horas;
        minutosFaltan = 60 - minutos;
        return (horasFaltan * 60) + minutosFaltan;
    }
}
