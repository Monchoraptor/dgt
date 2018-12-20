
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
    private String numeroCarnet;

    public Carnet(LocalDate fechaExpedicion, LocalDate fechaExpiracion, boolean gafas, String numeroCarnet) {
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

    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(String numeroCarnet) {
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
        String texto= "NºCarnet: "+numeroCarnet+" Gafas:"
        +gafas+" Fecha de obtención: "+fechaExpedicion+" fecha de Caducidad: "+fechaExpiracion;
        return texto;
    }

}
