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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GCM
 */
public class SEstatal implements Serializable {

    private ArrayList<DGT> listadodgts;
    private ArrayList<Usuario> listausuarios;
    private static int iddenuncia;

    public SEstatal() {
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

    public void addConductorADGT(String provincia,Conductor c) {
        DGT d=this.buscarDGTPorProvincia(provincia);
        d.addConductor(c);
    }
    public DGT buscarDGTPorProvincia(String provincia){
        boolean finwhile=false;
        for(int i=0;i<51;i++){
            if(this.listadodgts.get(i).getProvincia().equals(provincia)){
                return this.listadodgts.get(i);
                
            }
        }
        return null;
        
    }

    public void addFuncionarioADGT(String provincia, Funcionario nuevofuncionario) {
        DGT d=this.buscarDGTPorProvincia(provincia);
        d.addFuncionario(nuevofuncionario);
    }

    public void addAgenteADGT(String provincia, Agente nuevoagente) {
        DGT d=this.buscarDGTPorProvincia(provincia);
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

    public SEstatal restaurarBackup() throws ClassNotFoundException {
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
        File f = new File("Informe_Listado_de_Vehiculos" + LocalDateTime.now()+".txt");
        try {
            BufferedWriter bw = null;
            if (f.createNewFile()) {
                bw = new BufferedWriter(new FileWriter(f));
                bw.write("LISTADO DE VEHICULOS POR PROVINCIA \n ");
                bw.newLine();
                bw.newLine();
                for (int indexgts=0; indexgts<listadodgts.size(); indexgts++){
                    bw.write(listadodgts.get(indexgts).getProvincia() + "\n");
                        for (int indexpr=0;indexpr<listadodgts.get(indexgts).getListadoVehiculo().size();indexpr++){
                            bw.write(listadodgts.get(indexgts).getListadoVehiculo().get(indexpr).toString()+ "\n");
                            
                        }
                }
//                bw.write("Número de comparticiones: " + lastnumcomp);
//                bw.newLine();
//                lastnumcomp = 0;
//                ArrayList<Imagen> n = listadoImagenesNuevas();
//                bw.write("Número de imágenes nuevas: " + listadoImagenesNuevas().size());
//                bw.newLine();
//                ordenarPorRuta(n);
//                bw.write("Listado de ficheros que almacena las imagenes por orden algabetico:" + sacarListaRutas(n).toString());
//                bw.newLine();
//                ArrayList<Album> h = Albumesnuevos();
//                bw.write("Numero de albumes creado" + h.size());
//                bw.newLine();
//                bw.write("Listado de nombres de albumes ordenados por fecha" + ListaAlbumesPorNombre().toString());
//                bw.newLine();
//                bw.write("Usuarios conectados ese día" + usuariosConectados().toString());
//                bw.newLine();
                bw.write("---- Fin del Listado ----");
                bw.close();
            }
        } catch (IOException ioe) {
        }
    }
    public void informeListadoConductores() throws FileNotFoundException {
        File f = new File("Informe_Listado_de_Conductores" + LocalDateTime.now()+".txt");
        try {
            BufferedWriter bw = null;
            if (f.createNewFile()) {
                bw = new BufferedWriter(new FileWriter(f));
                bw.write("LISTADO DE CONDUCTORES POR PROVINCIA \n ");
                bw.newLine();
                bw.newLine();
                for (int indexgts=0; indexgts<listadodgts.size(); indexgts++){
                    bw.write(listadodgts.get(indexgts).getProvincia() + "\n");
                        for (int indexpr=0;indexpr<listadodgts.get(indexgts).getListadoConductores().size();indexpr++){
                            bw.write(listadodgts.get(indexgts).getListadoConductores().get(indexpr).toString()+ "\n");
                            
                        }
                }
    }
      bw.close();
            }
         catch (IOException ioe) {
        }
    }
    public void informeExpedientesenproceso() throws FileNotFoundException {
        File f = new File("Informe_Expedientes_en_Proceso_" + LocalDateTime.now()+".txt");
        try {
            BufferedWriter bw = null;
            if (f.createNewFile()) {
                bw = new BufferedWriter(new FileWriter(f));
                bw.write("LISTADO DE EXPEDIENTES DE SANCIONES EN PROCESO POR PROVINCIA \n ");
                bw.newLine();
                bw.newLine();
                for (int indexgts=0; indexgts<listadodgts.size(); indexgts++){
                    bw.write(listadodgts.get(indexgts).getProvincia() + "\n");
                        for (int indexpr=0;indexpr<listadodgts.get(indexgts).getListadoExpedientesEjecucion().size();indexpr++){
                            bw.write(listadodgts.get(indexgts).getListadoExpedientesEjecucion().get(indexpr).toString()+ "\n");
                            
                        }
                }
    }
      bw.close();
            }
         catch (IOException ioe) {
        }
    }

}

