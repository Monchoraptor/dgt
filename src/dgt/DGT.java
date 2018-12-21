/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author GCM
 */
public class DGT implements Serializable {

    private String provincia;
    private ArrayList<Conductor> listadoConductores;
    private ArrayList<Vehiculo> listadoVehiculos;
    private ArrayList<Funcionario> listadoFuncionarios;
    private ArrayList<Agente> listadoAgentes;
    private ArrayList<Usuario> listadoUsuarios;
    private ArrayList<Expediente> listadoExpedientesEjecucion;
    private ArrayList<Expediente> listadoExpedientesSobreseidos;
    private ArrayList<Expediente> listadoExpedientesSancionados;
    private ArrayList<Expediente> listadoExpedientes;

    public DGT(String provincia) {
        this.provincia = provincia;
        this.listadoConductores = new ArrayList();
        this.listadoVehiculos = new ArrayList();
        this.listadoAgentes = new ArrayList();
        this.listadoFuncionarios = new ArrayList();
        this.listadoExpedientesEjecucion = new ArrayList();
        this.listadoExpedientesSobreseidos = new ArrayList();
        this.listadoExpedientesSancionados = new ArrayList();
        this.listadoExpedientes = new ArrayList();
        this.listadoUsuarios = new ArrayList();
    }

    public String getProvincia() {
        return provincia;
    }

    public ArrayList<Funcionario> getListadoFuncionarios() {
        return listadoFuncionarios;
    }

    public ArrayList<Conductor> getListadoConductores() {
        return listadoConductores;
    }
    public ArrayList<Vehiculo> getListadoVehiculo() {
        return listadoVehiculos;
    }
    

    public ArrayList<Expediente> getListadoExpedientesSobreseidos() {
        return listadoExpedientesSobreseidos;
    }

    public ArrayList<Expediente> getListadoExpedientesSancionados() {
        return listadoExpedientesSancionados;
    }

    public ArrayList<Expediente> getListadoExpedientesEjecucion() {
        return listadoExpedientesEjecucion;
    }
    public boolean addConductor(Conductor c) {
        if (listadoConductores.contains(c)) {
            return false;
        } else {
            listadoConductores.add(c);
            return true;
        }
    }

    public boolean addFuncionario(Funcionario f) {
        if (listadoFuncionarios.contains(f)) {
            return false;
        } else {
            listadoFuncionarios.add(f);
            return true;
        }
    }

    public boolean addAgente(Agente nuevoagente) {
        if (listadoAgentes.contains(nuevoagente)) {
            return false;
        } else {
            listadoAgentes.add(nuevoagente);
            return true;
        }
    }

    public boolean delConductor(Conductor c) {
        if (listadoConductores.contains(c)) {
            listadoConductores.remove(c);
            return true;
        } else {
            return false;
        }
    }

    public boolean existeConductor(String s) {
        for (int i = 0; i < listadoConductores.size(); i++) {
            return listadoConductores.get(i).getCarne().getNumeroCarnet().equals(s);
        }
        return false;
    }

    public Conductor buscarConductor(String a) {
        for (int i = 0; i < listadoConductores.size(); i++) {
            if (listadoConductores.get(i).getCarne().getNumeroCarnet().equals(a)) {
                return listadoConductores.get(i);
            }
        }
        return null;
    }

    public boolean addVehiculo(Vehiculo v) {
        if (listadoVehiculos.contains(v)) {
            return false;
        } else {
            listadoVehiculos.add(v);
            return true;
        }
    }

    public boolean delVehiculo(Vehiculo v) {
        if (listadoVehiculos.contains(v)) {
            listadoVehiculos.remove(v);
            return true;
        } else {
            return false;
        }
    }

    public boolean existeVehiculo(String s) {
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            return listadoVehiculos.get(i).getMatricula().equals(s);
        }
        return false;
    }

    public Vehiculo buscarVehiculo(String a) {
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            if (listadoVehiculos.get(i).getMatricula().equals(a)) {
                return listadoVehiculos.get(i);
            }
        }
        return null;
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
                } else {
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

    public boolean tipoDenuncia(String s) {
        return s.contentEquals("-");
    }

    public boolean crearExpedienteAgente(LocalDateTime fechaHora, String causa, double importe, String s) {

        if (s.contentEquals("-")) {
            if (existeConductor(s)) {
                DenunciaConductor dc = new DenunciaConductor(fechaHora, causa, importe, buscarConductor(s));
                Expediente exp = new Expediente(dc);
                addExpediente(exp);
                return true;
            } else {
                if (existeVehiculo(s)) {
                    DenunciaVehiculo dc = new DenunciaVehiculo(buscarVehiculo(s), fechaHora, causa, importe);
                    Expediente exp = new Expediente(dc);
                    addExpediente(exp);
                    return true;
                }

            }

        }
        return false;
    }

    public Usuario buscarUsuarioEnDGT(String usuario, String contrasena) {
        for (int i = 0; i < this.listadoConductores.size(); i++) {
            if (this.listadoConductores.size() > 0) {
                if ((this.listadoConductores.get(i).getNombreusuario().equals(usuario))
                        && this.listadoConductores.get(i).getContraseña().equals(contrasena)) {
                    return this.listadoConductores.get(i);
                }
            }
        }
        for (int i = 0; i < this.listadoFuncionarios.size(); i++) {
            if (this.listadoFuncionarios.size() > 0) {
                if ((this.listadoFuncionarios.get(i).getNombreusuario().equals(usuario))
                        && this.listadoFuncionarios.get(i).getContraseña().equals(contrasena)) {
                    return this.listadoFuncionarios.get(i);
                }
            }
        }
        for (int i = 0; i < this.listadoAgentes.size(); i++) {
            if (this.listadoAgentes.size() > 0) {
                if ((this.listadoAgentes.get(i).getNombreusuario().equals(usuario))
                        && this.listadoAgentes.get(i).getContraseña().equals(contrasena)) {
                    return this.listadoAgentes.get(i);
                }
            }
        }
        return null;

    }

    public Conductor buscarConductorEnDGT(String numerocarnet) {
        for(int i=0;i<this.listadoConductores.size();i++){
            if(this.listadoConductores.get(i).getCarne().getNumeroCarnet().equals(numerocarnet)){
                return this.listadoConductores.get(i);
            }
        }
        return null;
    }

}
