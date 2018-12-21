/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author GCM
 */
public class SEstatal implements Serializable {

    private ArrayList<DGT> listadodgts;
    private static String s = "A Coruña\n"
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
    private static String[] comunidades = s.split("\n");

    public SEstatal() {
        this.listadodgts = new ArrayList();
        System.out.println(comunidades.length);
        for (int i = 0; i < SEstatal.comunidades.length; i++) {
            DGT nueva = new DGT(SEstatal.comunidades[i]);
            listadodgts.add(nueva);
        }
        Funcionario admin = new Funcionario(0, "admin", "admin", "Zaragoza", "admin", "admin", "admin", "admin");
        this.addFuncionarioADGT("Zaragoza", admin);
    }

    public SEstatal(ArrayList<DGT> listadodgts, ArrayList<Usuario> listausuarios) {
        this.listadodgts = listadodgts;
    }

    public ArrayList<DGT> getListadodgts() {
        return listadodgts;
    }

    public void setListadodgts(ArrayList<DGT> listadodgts) {
        this.listadodgts = listadodgts;
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
        for (int i = 0; i < SEstatal.comunidades.length; i++) {
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

    public void addCocheADGT(String provincia, Coche c) {
        DGT d = this.buscarDGTPorProvincia(provincia);
        d.addVehiculo(c);
    }

    public void addCamionADGT(String provincia, Camion c) {
        DGT d = this.buscarDGTPorProvincia(provincia);
        d.addVehiculo(c);
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

    public void informeListadoVehiculos() throws FileNotFoundException {
        File f = new File("Informe_Listado_de_Vehiculos" + LocalDateTime.now() + ".txt");
        try {
            BufferedWriter bw = null;
            if (f.createNewFile()) {
                bw = new BufferedWriter(new FileWriter(f));
                bw.write("LISTADO DE VEHICULOS POR PROVINCIA \n ");
                bw.newLine();
                bw.newLine();
                for (int indexgts = 0; indexgts < listadodgts.size(); indexgts++) {
                    bw.write(listadodgts.get(indexgts).getProvincia() + "\n");
                    for (int indexpr = 0; indexpr < listadodgts.get(indexgts).getListadoVehiculo().size(); indexpr++) {
                        bw.write(listadodgts.get(indexgts).getListadoVehiculo().get(indexpr).toString() + "\n");

                    }
                }
                bw.write("---- Fin del Listado ----");
                bw.close();
            }
        } catch (IOException ioe) {
        }
    }

    public ArrayList<Expediente> denunciasConductor(Conductor conductor, String provincia) {
        DGT dgt = buscarDGTPorProvincia(provincia);
        ArrayList<Expediente> exp = new ArrayList();
        for (int i = 0; i < dgt.getListadoExpedientesEjecucion().size(); i++) {
            if (dgt.getListadoExpedientesEjecucion().get(i).getDenuncia().getClass().getSimpleName().equals("DenunciaVehiculo")) {
                DenunciaVehiculo dv = (DenunciaVehiculo) dgt.getListadoExpedientesEjecucion().get(i).getDenuncia();
                if (dv.getVehiculo().getClass().getSimpleName().equals("Coche")) {
                    Coche nc;
                    nc = (Coche) dv.getVehiculo();
                    if (nc.getHabitual().equals(conductor)) {
                        exp.add(dgt.getListadoExpedientesEjecucion().get(i));

                    }
                }
            }
        }
        return exp;
    }

    public Usuario iniciarSesion(String nombreusuario, String contrasena) {
        for (int i = 0; i < SEstatal.comunidades.length; i++) {
            if (this.getListadodgts().get(i).buscarUsuarioEnDGT(nombreusuario, contrasena) != null) {
                return this.getListadodgts().get(i).buscarUsuarioEnDGT(nombreusuario, contrasena);
            }
        }
        return null;
    }

    public Conductor getConductor(String numerocarnet) {
        for (int i = 0; i < SEstatal.comunidades.length; i++) {
            if (this.getListadodgts().get(i).buscarConductorEnDGT(numerocarnet) != null) {
                return this.getListadodgts().get(i).buscarConductorEnDGT(numerocarnet);
            }
        }
        return null;
    }
}
