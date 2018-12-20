/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author GCM
 */
public class SEstatal implements Serializable {

    private ArrayList<DGT> listadodgts;
    private ArrayList<Usuario> listausuarios;
    private String s = "A Coruña\n"
            + "Álava\n"
            + "Albacete\n"
            + "Alicante\n"
            + "Almería\n"
            + "Asturias\n"
            + "Ávila\n"
            + "Badajoz\n"
            + "Islas Baleares\n"
            + "Barcelona\n"
            + "Burgos\n"
            + "Cáceres\n"
            + "Cádiz\n"
            + "Cantabria\n"
            + "Castellón\n"
            + "Ciudad Real\n"
            + "Córdoba\n"
            + "Cuenca\n"
            + "Girona\n"
            + "Granada\n"
            + "Guadalajara\n"
            + "Guipúzcoa\n"
            + "Huelva\n"
            + "Huesca\n"
            + "Jaén\n"
            + "La Rioja\n"
            + "Las Palmas\n"
            + "León\n"
            + "Lleida\n"
            + "Lugo\n"
            + "Madrid\n"
            + "Málaga\n"
            + "Murcia\n"
            + "Navarra\n"
            + "Orense\n"
            + "Palencia\n"
            + "Pontevedra\n"
            + "Salamanca\n"
            + "Segovia\n"
            + "Sevilla\n"
            + "Soria\n"
            + "Tarragona\n"
            + "Santa Cruz de Tenerife\n"
            + "Teruel\n"
            + "Toledo\n"
            + "Valencia\n"
            + "Valladolid\n"
            + "Vizcaya\n"
            + "Zamora\n"
            + "Zaragoza\n"
            + "Ceuta y Melilla";
    private String[] comunidades = s.split("\n");

    public SEstatal() {
        this.listadodgts = new ArrayList();
        this.listausuarios = new ArrayList();
        System.out.println(comunidades.length);
    }

    public SEstatal(ArrayList<DGT> listadodgts, ArrayList<Usuario> listausuarios) {
        this.listadodgts = listadodgts;
        this.listausuarios = listausuarios;
    }

    public ArrayList<DGT> getListadodgts() {
        return listadodgts;
    }

    public void setListadodgts(ArrayList<DGT> listadodgts) {
        this.listadodgts = listadodgts;
    }

    public ArrayList<Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(ArrayList<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addConductorADGT(String provincia, Conductor c) {
        DGT d = this.buscarDGTPorProvincia(provincia);
        d.addConductor(c);
    }

    public DGT buscarDGTPorProvincia(String provincia) {
        boolean finwhile = false;
        for (int i = 0; i < 51; i++) {
            if (this.listadodgts.get(i).getProvincia().equals(provincia)) {
                return this.listadodgts.get(i);

            }
        }
        return null;

    }

    public void addFuncionarioADGT(String provincia, Funcionario nuevofuncionario) {
        DGT d = this.buscarDGTPorProvincia(provincia);
        d.addFuncionario(nuevofuncionario);
        System.out.println(d.getListadoFuncionarios().toString());
    }

    public void addAgenteADGT(String provincia, Agente nuevoagente) {
        DGT d = this.buscarDGTPorProvincia(provincia);
        d.addAgente(nuevoagente);
    }

    public void backup() {
        try {
            FileOutputStream out = new FileOutputStream("backup.dat");
            ObjectOutputStream so = new ObjectOutputStream(out);
            so.writeObject(this);
        } catch (IOException ex) {

        }
    }

    public static SEstatal restaurarBackup() throws ClassNotFoundException {
        SEstatal s = new SEstatal();
        try {
            FileInputStream in = new FileInputStream("backup.dat");
            ObjectInputStream si = new ObjectInputStream(in);
            s = (SEstatal) si.readObject();
            return s;
        } catch (FileNotFoundException exx) {
            System.out.print(exx);
        } catch (IOException ex) {
            System.out.print(ex);
        }
        return s;
    }

}
