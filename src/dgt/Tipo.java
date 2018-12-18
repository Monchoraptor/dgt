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
public enum Tipo {
    Administrador, Funcionario, Agente, Conductor;

    public static Tipo getAdministrador() {
        return Administrador;
    }

    public static Tipo getConductor() {
        return Conductor;
    }

    public static Tipo getFuncionario() {
        return Funcionario;
    }

    public static Tipo getAgente() {
        return Agente;
    }

    @Override
    public String toString() {
        return super.toString();}
    
}
