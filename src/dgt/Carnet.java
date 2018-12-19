/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.time.LocalDate;

/**
 *
 * @author GCM
 */
public class Carnet {

    private LocalDate fechaExpedicion;
    private LocalDate fechaExpiracion;
    private boolean gafas;
    private int numeroCarnet;

    public Carnet(LocalDate fechaExpedicion, LocalDate fechaExpiracion, boolean gafas, int numeroCarnet) {
        this.fechaExpedicion = fechaExpedicion;
        this.fechaExpiracion = fechaExpiracion;
        this.gafas = gafas;
        this.numeroCarnet = numeroCarnet;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public boolean isGafas() {
        return gafas;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Carnet c) {
        return((this.fechaExpedicion.equals(c.getFechaExpedicion()))&&(this.fechaExpiracion.equals(c.getFechaExpedicion()))&&(this.numeroCarnet==c.getNumeroCarnet())&&(this.gafas==c.isGafas())) ;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
