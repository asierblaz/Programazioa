/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Arrays;

/**
 *
 * @author blazquez.asier
 */
public class ArrayToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            int numeros[]=  {1, 7, 8, 3, 7};
          
        System.out.println("Print array int to string {1, 7, 8, 3, 7}; ");
      
        System.out.println((arrayToString(numeros)));
        System.out.println("");
   
    }
    
    
    public static String arrayToString(int [] n){
        
        String s="";
        
      
       
    for(int i=0; i<n.length ; i++){
      s=s+n[i];
 
     }
        
        return s;
    }


//    public static String[] arrayToString(int [] n){
//        
//        String s[];
//        
//        s = new String [n.length];
//        
//      
//       
//    for(int i=0; i<n.length ; i++){
//      s[i]=Integer.toString(n[i]);
// 
//     }
//        
//        return s;
//    }


}