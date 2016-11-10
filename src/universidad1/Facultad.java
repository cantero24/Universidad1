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
public class Facultad {
    String direccion;
    String ciudad;

    public Facultad(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    
    
    
    public void mostrar(){
    System.out.println(this.ciudad);
    System.out.println(this.direccion);
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
