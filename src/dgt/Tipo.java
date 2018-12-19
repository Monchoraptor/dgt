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
    Funcionario, Agente, Conductor;

    public static Tipo getConductor() {
        return Conductor;
    }

    public static Tipo getFuncionario() {
        return Funcionario;
    }

    public static Tipo getAgente() {
        return Agente;
    }
    public static Tipo setTipo(String s){
        switch (s){
            case "Conductor": return Tipo.getConductor();
            case "Funcionario": return Tipo.getFuncionario();
            case "Agente": return Tipo.getAgente(); 
            default: return Tipo.getConductor();
        }
    }
    public static Tipo setTipo(){
        return Tipo.getConductor();
    }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
