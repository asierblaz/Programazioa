package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class IntegranteSeleccion {
  protected int id;
  protected String nombre;
  protected String apellidos;
  protected int edad;

    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public IntegranteSeleccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    public void viajar(){
        System.out.println("Bidaiatzen...✈✈✈");
    }
       public void concentrarse(){
        System.out.println("Kontrentrazioa...✈✈✈");
    }
    

    @Override
    public String toString() {
        return "IntegranteSeleccion{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
  
}
