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
public class DireccionGT {

    private String provincia;
    private ArrayList<Conductor> listadoC;
    private ArrayList<Vehiculo> listadoV;
    private ArrayList<Expediente> listadoEE;
    private ArrayList<Expediente> listadoEF;
    private ArrayList<Expediente> listadoE;

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

    public boolean addExpediente(Expediente c) {
        if (listadoE.contains(c)) {
            return false;
        } else {
            listadoE.add(c);
            return true;
        }
        String estate = c.getEstado();

        if (estate == "EJECUCION") {
            if (listadoEE.contains(c)) {
            } else {
                listadoEE.add(c);
            }
        } else {
            if (listadoEF.contains(c)) {
            } else {
                listadoEF.add(c);
            }
        }
    }

    public boolean delConductor(Expediente c) {
        if (listadoE.contains(c)) {
            listadoE.remove(c);
            return false;
        } else {

            return true;
        }
        if (c.getEstado().toString() == "EJECUCION") {
            if (listadoEE.contains(c)) {
                listadoEE.remove(c);
            }
        } else {
            if (listadoEF.contains(c)) {
                listadoEF.remove(c);
            }

        }
        return false;
    }
}
