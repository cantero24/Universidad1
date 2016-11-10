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
public class Formacion {
    int codigo;
    Facultad facultad;
    ArrayList<Alumno> alumno = new ArrayList<Alumno>();

    public ArrayList<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

   
    public Formacion(int codigo, Facultad facultad) {
        this.codigo = codigo;
        this.facultad = facultad;
    }

    public void mostrar(){
        System.out.println(this.codigo);
        System.out.println(this.facultad);
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
