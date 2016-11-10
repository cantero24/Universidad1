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
public class Moficial extends Master{

     String titulo;

    public Moficial(String titulo, String especialidad, int codigo, Facultad facultad) {
        super(especialidad, codigo, facultad);
        this.titulo = titulo;
    }

    public ArrayList<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

 
    
      public void mostrar() {
         super.mostrar();
         System.out.println(this.titulo);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
