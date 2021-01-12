/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrenar() {
        System.out.println("Entrenamendua eginda ⚽⚽⚽");
    }

    public void jugarPartido() {
        System.out.println("Partidua jokatzen ⚽⚽⚽");
    }
//Futbolista{id=1, nombre=Asier,
  //   * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}
    @Override
    public String toString() {
        return "Futbolista{id="+id+", nombre="+nombre+",  apellidos="+apellidos+", edad="+edad+", dorsal="+dorsal+", demarcacion="+demarcacion+"}";
    }

}
