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

    public Camion(String a, String b, long c, ArrayList<Conductor> d) {
        super(a, b);
        cif = c;
        conductores = d;
    }

    public boolean addConductor(Conductor c) {
        if (conductores.contains(c)) {
            return false;
        } else {
            conductores.add(c);
            return true;
        }
    }

    public boolean delConductor(Conductor c) {
        if (conductores.contains(c)) {
            conductores.remove(c);
            return true;
        } else {
            return false;
        }
    }
    public String listadeconductores(){
        String s = new String ("<html><body>");
    for (int i=0; i<conductores.size(); i++){
        s.concat(conductores.get(i).getNombre() + " " + conductores.get(i).getApellidos() + "<br>");
    }
    s.concat("</body></html>");
    return s;
}
}
