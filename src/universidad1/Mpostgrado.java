/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad1;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Mpostgrado extends Master{
    int estprecio;

    public Mpostgrado(int estprecio, String especialidad, int codigo, Facultad facultad) {
        super(especialidad, codigo, facultad);
        this.estprecio = estprecio;
    }

    public ArrayList<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

     public void mostrar() {
         super.mostrar();
         System.out.println(this.estprecio);
    }
    public int getEstprecio() {
        return estprecio;
    }

    public void setEstprecio(int estprecio) {
        this.estprecio = estprecio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    
}
