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
public class Camion extends Vehiculo {

    private long cif;
    private ArrayList<Conductor> conductores;

    public Camion(String matricula, String color, long cif, ArrayList<Conductor> conductores) {
        super(matricula, color);
        this.cif = cif;
        this.conductores = conductores;
    }

    public String addConductor(Conductor c) {
        if (conductores.contains(c)) {
            return "El conductor ya estaba añadido";
        } else {
            conductores.add(c);
            return "El conductor ha sido añadido";
        }
    }

    public String delConductor(Conductor c) {
        if (conductores.contains(c)) {
            conductores.remove(c);
            return "El conductor ha sido removido de este vehiculo";
        } else {
            return "El conductor no está asociado a este vehiculo";
        }
    }

    public String listadeconductores() {
        String s = new String("<html><body>");
        for (int i = 0; i < conductores.size(); i++) {
            s.concat(conductores.get(i).getNombre() + " " + conductores.get(i).getApellidos() + "<br>");
        }
        s.concat("</body></html>");
        return s;
    }
    public String toString(){//Podriamos haber usado un super si hubieramos hecho un toString en vehiculo
        String s = "Conductores Habituales:  ";
        for (int i=0; i<conductores.size(); i++){
            s.concat(conductores.get(i) + "\n");
        }
        return "Camion --> " + "Cif" + cif + " ,  Color: " + this.getColor() + " ,  Matricula: " + this.getMatricula() + s;
    }


}
