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
public class Master extends Formacion{
    String especialidad;

    public Master(String especialidad, int codigo, Facultad facultad) {
        super(codigo, facultad);
        this.especialidad = especialidad;
    }

    public ArrayList<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

   
    public void mostrar() {
         super.mostrar();
         System.out.println(this.especialidad);
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
