/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

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
    }
}
