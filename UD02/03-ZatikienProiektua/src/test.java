
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Zatikia[] zatikiak = new Zatikia[10];
        Zatikia zat1 = new Zatikia(1, 2);
        Zatikia zat2 = new Zatikia(8, 4);
        Zatikia zat3 = new Zatikia(8, 4);
        Zatikia zat4 = new Zatikia(16, 8);
        System.out.println(zat1);
zat1.batu(zat4);
zat1.setIzendatzailea(35);
       
        System.out.println(zat2.isBaliokidea(zat3));

     
        /* System.out.println(zat1.isBiggerThan(zat));
        
        zat1.batu(zat1);
        System.out.println(  zat1.hamartarBaliokidea());

        Zatikia[] zatikiak = { new Zatikia("1/2"),new Zatikia(9, 2),new Zatikia(7, 8),new Zatikia(1, 10000)};
        
        zat1.zatikiakOrdenatu(zatikiak);
        
        System.out.println(Arrays.toString(zatikiak));
        
        zat2.simplificatu();
        System.out.println(zat2);
        
        System.out.println( zat3.isBaliokidea(zat4));*/
        
        System.out.println(" ______   ____ \n" +
" |___ \\ \\ / /_ |\n" +
"   __) \\ V / | |\n" +
"  |__ < > <  | |\n" +
"  ___) / . \\ | |\n" +
" |____/_/ \\_\\|_|");

    }
}
