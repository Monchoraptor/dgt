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
public class Alegacion {

    private StringBuffer textoAlegacion;
    private boolean aceptada;

    public Alegacion() {
    }

    public StringBuffer getTextoAlegacion() {
        return textoAlegacion;
    }

    public void setTextoAlegacion(StringBuffer textoAlegacion) {
        this.textoAlegacion = textoAlegacion;
    }

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }
    public String StringAceptada(){
        if (aceptada){return "Sí";}
        else{
            return "No";
            
        }
    }
    public String toString(){
        return "Alegación --> Texto de la alegación" + this.getTextoAlegacion() + " , ¿Esta alegacion ha sido aceptada? " + this.StringAceptada();
    }

}
