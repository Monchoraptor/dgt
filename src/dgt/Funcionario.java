/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.io.Serializable;

/**
 *
 * @author amora
 */
public class Funcionario extends Usuario implements Serializable {

    private int identificacion;

    public Funcionario(int identificacion, String nombreusuario, String contraseña, String provincia, String nombre, String apellidos, String direccion, String email) {
        super(nombreusuario, contraseña, provincia, nombre, apellidos, direccion, email);
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

}
