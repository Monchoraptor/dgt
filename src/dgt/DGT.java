/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author GCM
 */
public class DGT {

    private String provincia;
    private ArrayList<Conductor> listadoC;
    private ArrayList<Vehiculo> listadoV;
    private ArrayList<Expediente> listadoExpedientesEjecucion;
    private ArrayList<Expediente> listadoExpedientesSobreseidos;
    private ArrayList<Expediente> listadoExpedientesSancionados;
    private ArrayList<Expediente> listadoExpedientes;

    public boolean addConductor(Conductor c) {
        if (listadoC.contains(c)) {
            return false;
        } else {
            listadoC.add(c);
            return true;
        }
    }

    public boolean delConductor(Conductor c) {
        if (listadoC.contains(c)) {
            listadoC.remove(c);
            return true;
        } else {
            return false;
        }
    }
    public boolean existeConductor(String s) {
        for ( int i=0;i<listadoC.size(); i++){
            return listadoC.get(i).getCarne().getNumerold().equals(s);
    }}
    public Conductor buscarConductor(String a){
         for ( int i=0;i<listadoC.size(); i++){
                if (listadoC.get(i).getCarne().getNumerold().equals(a)){
                    return listadoC.get(i);
                }
            }
    }
            

    public boolean addVehiculo(Vehiculo v) {
        if (listadoV.contains(v)) {
            return false;
        } else {
            listadoV.add(v);
            return true;
        }
    }

    public boolean delVehiculo(Vehiculo v) {
        if (listadoV.contains(v)) {
            listadoV.remove(v);
            return true;
        } else {
            return false;
        }
    }
    public boolean existeVehiculo(String s) {
        for ( int i=0;i<listadoV.size(); i++){
            return listadoV.get(i).getMatricula().equals(s);
    }}
    public Vehiculo buscarVehiculo(String a){
         for ( int i=0;i<listadoV.size(); i++){
                if (listadoV.get(i).getMatricula().equals(a)){
                    return listadoV.get(i);
                }
            }
    }
    public String addExpediente(Expediente c) {
        if (listadoExpedientes.contains(c)) {
            return "El expediente ya existe";
        } else {
            listadoExpedientes.add(c);
            if (c.getEstado().name().equals("EJECUCION")) {
                listadoExpedientes.add(c);
                listadoExpedientesEjecucion.add(c);
                return "El expediente ha sido añadido como expediente en ejecucion";
            } else {
                if (c.getEstado().name().equals("SANCIONADO")) {
                    listadoExpedientes.add(c);
                    listadoExpedientesSancionados.add(c);
                    return "El expediente ha sido añadido como expediente sancionado";
                }
                else{
                    listadoExpedientes.add(c);
                    listadoExpedientesSobreseidos.add(c);
                    return "El expediente ha sido añadido como expediente sobreseido";
                }
            }
        }
    }

    public String delExpediente(Expediente c) {
        if (listadoExpedientes.contains(c)) {
            listadoExpedientes.remove(c);
            if (c.getEstado().name().equals("EJECUCION")) {
                if (listadoExpedientesEjecucion.contains(c)) {
                    listadoExpedientesEjecucion.remove(c);
                }
            } else {
                listadoExpedientesSobreseidos.remove(c);
            }

            return "El expediente ha sido borrado";
        } else {

        }
        return null;
    }
    public boolean tipoDenuncia(String s){
        return s.contentEquals("-");
    }
    public boolean crearExpedienteAgente(LocalDateTime fechaHora, String causa, double importe, String s){
        Denuncia d = new Denuncia(fechaHora, causa, importe);
        
        if (s.contentEquals("-")){
            if (existeConductor(s)){
                DenunciaConductor dc = new DenunciaConductor(d, buscarConductor(s));
                Expediente exp = new Expediente(dc);
                addExpediente(exp);
                return true;
            }
        else{
            if (existeVehiculo(s)){
                DenunciaVehiculo dc = new DenunciaVehiculo(d, buscarVehiculo(s));
                Expediente exp = new Expediente(dc);
                addExpediente(exp);
                return true;
            }  
            
        }
        
            
        
    
    }
}}
