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
public class Notificacion {

    private int plazo;
    private Alegacion aleg;
    private String causa;
    private double importe;

    public Notificacion(int plazo, Alegacion aleg, String causa, double importe) {
        this.plazo = plazo;
        this.aleg = aleg;
        this.causa = causa;
        this.importe = importe;
    }

    public Alegacion getAleg() {
        return aleg;
    }

    public void setAleg(Alegacion aleg) {
        this.aleg = aleg;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public boolean equals(Notificacion obj) {
        if(this==obj){return true;}
        if(this==null){return false;}
        if(this.getClass() != obj.getClass()){return false;}
        Notificacion not = (Notificacion) obj;
        return((this.plazo==not.plazo)&&(this.aleg.equals(not.aleg))&&(this.importe==not.importe)&&(this.causa==not.causa));
        
    }

    @Override
    public String toString() {
        String texto= "Plazo: "+plazo+" Alegación: "+aleg.toString()+" Causa: "+
                causa+" Importe: "+importe;
        return texto;
    }

}
