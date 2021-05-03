

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class CuentasUsuarios {
    
    public static void main(String[] args) {
        
        
        Cliente cl1 = new Cliente("Antonio Banderas","00001",200000);
        Cliente cl2 = new Cliente("Rafael Nadal","00002",250000);
        Cliente cl3 = new Cliente("Penelope Cruz","00003",300000);
        Cliente cl4 = new Cliente("Julio Iglesias","00004",500000);
        Cliente cl5 = new Cliente("Antonio Banderas","00001",200000);

        //1.  Se pueden repetir clientes? NO
        //2. Agregar borrar?
        //3. Solo lectura?
        //Collection tipo set
        

        
        Set <Cliente> clientesBanco = new HashSet<Cliente>();
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5); // se inserta, para java son objetos diferentes
        
        

        for (Cliente cliente : clientesBanco) {
        
            System.out.println(cliente.getNombre()+ " "
                    + cliente.getN_cuenta()+" "+
                    " "+ cliente.getSaldo());
        }


    }
}
