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
public class Expediente {

    private Denuncia denuncia;
    private Alegacion alegacion;
    private Notificacion notificacion;
    private Estado estado;
    
    public Expediente(Denuncia denunc){
        this.denuncia=denunc;
        this.estado= Estado.getEJECUCION();
        
    }

    public Expediente(Denuncia denunc, Alegacion alegacion, Notificacion notif, Estado estado) {
        this.denuncia = denunc;
        this.alegacion = alegacion;
        this.notificacion = notif;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Alegacion getAlegacion() {
        return alegacion;
    }

    public void setAlegacion(Alegacion alegacion) {
        this.alegacion = alegacion;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
    if (this==obj) return true;
    if (getClass()!=obj.getClass()) return false;
    if (obj==null) return false;
    Expediente exp = (Expediente) obj;
        return(this.denuncia.equals(exp.denuncia)&&this.alegacion.equals(exp.alegacion)&&this.notificacion.equals(exp.notificacion)&&this.estado==exp.estado);
     }
    @Override
    public String toString(){
        String texto= "Informe: \n";
           texto.concat("Denuncia: "+denuncia.toString()+" Alegación: "+alegacion.toString()+
        " Notificación: "+notificacion.toString()+" Estado: "+estado.name() + "\n" + "--- Fin de Expediente --  \n");
           
        return texto;
    }
    public Expediente(DenunciaVehiculo denunciaVehiculo){
        denuncia=denunciaVehiculo;
        estado=Estado.getEJECUCION();
    }
    public Expediente(DenunciaConductor denunciaConductor){
        denuncia=denunciaConductor;
        estado=Estado.getEJECUCION();
    }
    
            

}
