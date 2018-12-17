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
    private Denuncia denunc;
    private Alegacion alega;
    private Notificacion notif;
    private Estado estate;
    
    public Estado getEstado(){
        return estate;
    }
    
    public String toString(){
        return estate;
    }
}
