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
public abstract class Denuncia {

    private LocalDateTime fechaHora;
    private static int codigo;
    private String causa;
    private double importe;

    public Denuncia(LocalDateTime fechaHora, String causa, double importe) {
        this.fechaHora = fechaHora;
        this.codigo = codigo++;
        this.causa = causa;
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean equals(Object obj) {
        if (this == d) {
            return true;
        }
        if (getClass() != d.getClass()) {
            return false;
        }
        if (d == null) {
            return false;
        }
        Denuncia den= (Denuncia)obj;
        return (this.getCodigo() == den.getCodigo()&&
                this.getFechaHora() == den.getFechaHora()
                &&this.getCausa()==den.getCausa()
                &&this.getImporte()==den.getImporte());
    }

}
