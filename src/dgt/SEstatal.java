/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.io.Serializable;
import java.util.ArrayList;

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
    
    
}
