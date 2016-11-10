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
public class Becario extends Alumno{
    String departamento;

    public Becario(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    public void mostrar() {
         super.mostrar();
         System.out.println(this.departamento);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    
}
