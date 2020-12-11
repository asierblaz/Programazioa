package string;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class CheckBinStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int num=0;
      
        System.out.println("Sartu Comprobatu nahi duzun zenbakia ea binarioa den ala ez jakiteko: ");
        num= in.nextInt();
        String numStr= Integer.toString(num); 
        boolean esta=false;
         int i=0;
        while(i<numStr.length()&& esta==false){
        
            if(numStr.charAt(i)!='0'&& numStr.charAt(i)!='1'){
            
            esta=true;
            }
            i++;
        }
                 
            if(esta==false){
                System.out.println("Es binario");
            
            }else{
                System.out.println("No es binario");
            }
      

    }}