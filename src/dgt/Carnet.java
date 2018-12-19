/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.time.LocalDateTime;

/**
 *
 * @author GCM
 */
public class Carnet {

    private LocalDateTime fechaObtencion;
    private LocalDateTime fechaCaducidad;
    private boolean gafas;
    private String numerold;

    public Carnet(LocalDateTime fechaObtencion, LocalDateTime fechaCaducidad, boolean gafas, String numerold) {
        this.fechaObtencion = fechaObtencion;
        this.fechaCaducidad = fechaCaducidad;
        this.gafas = gafas;
        this.numerold = numerold;
    }

    public LocalDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDateTime getFechaObtencion() {
        return fechaObtencion;
    }

    public void setFechaObtencion(LocalDateTime fechaObtencion) {
        this.fechaObtencion = fechaObtencion;
    }

    public String getNumerold() {
        return numerold;
    }

    public void setNumerold(String numerold) {
        this.numerold = numerold;
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
        return((this.fechaObtencion.equals(c.getFechaObtencion()))&&(this.fechaCaducidad.equals(c.getFechaObtencion()))&&(this.numerold==c.getNumerold())&&(this.gafas==c.isGafas())) ;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
