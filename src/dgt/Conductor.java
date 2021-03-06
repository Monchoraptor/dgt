/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

/**
 *
 * @author GCM
 */
public class Conductor extends Usuario {

    private Carnet carnet;

    public Conductor(Carnet carnet, String nombreusuario, String contraseña, String provincia, String nombre, String apellidos, String direccion, String email) {
        super(nombreusuario, contraseña, provincia, nombre, apellidos, direccion, email);
        this.carnet = carnet;
    }

    public Carnet getCarne() {
        return carnet;
    }

    public void setCarne(Carnet carnet) {
        this.carnet = carnet;
    }
    public boolean equals(Object con){
    if (this==con) return true;
    if (getClass()!=con.getClass()) return false;
    if (con==null) return false;
    Conductor driver= (Conductor) con;
    return this.carnet.getNumeroCarnet().equals(driver.carnet.getNumeroCarnet());
     }
    
    public String toString(){
        return "Conductor --> Nombre: " + this.getNombre() + " , Apellidos: " + this.getApellidos() + ", Direccion: " + this.getDireccion() + " , Email: " + this.getEmail() + " , " + carnet.toString();
}

}
