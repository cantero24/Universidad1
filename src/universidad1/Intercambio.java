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
public class Intercambio extends Alumno{

    public Intercambio(String univerdadorigen, String nombre, int edad) {
        super(nombre, edad);
        this.univerdadorigen = univerdadorigen;
    }
    
    public void mostrar() {
         super.mostrar();
         System.out.println(this.univerdadorigen);
    }

    public String getUniverdadorigen() {
        return univerdadorigen;
    }

    public void setUniverdadorigen(String univerdadorigen) {
        this.univerdadorigen = univerdadorigen;
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
  
    String univerdadorigen;
    
    
}
    

