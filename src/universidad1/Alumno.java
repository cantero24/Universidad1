/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad1;

/**
 *
 * @author usuario
 */
public abstract class Alumno {

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

     public void mostrar() {
         System.out.println(this.nombre);
         System.out.println(this.edad);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    String nombre;
    int edad;
    
}
