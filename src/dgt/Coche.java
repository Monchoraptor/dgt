/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

/**
 *
 * @author GCM
 */
public class Coche extends Vehiculo {

    private String modelo;
    private Conductor habitual;

    public Coche(String modelo, Conductor habitual, String matricula, String color) {
        super(matricula, color);
        this.modelo = modelo;
        this.habitual = habitual;
    }
     public boolean equals(Coche car){
    if (this==car) return true;
    if (getClass()!=car.getClass()) return false;
    if (car==null) return false;
    Coche carro = (Coche) car;
    if(this.getMatricula().equals(carro.getMatricula())){
     return true;}
    else{
        return false;
    }
}
     public String toString(){
        String texto= "Matricula Vehiculo: "+getMatricula()+" Color del Vehiculo:"
        + " "+getColor()+" Modelo del Coche: "+modelo+" Conductor: "+habitual;
        return texto;
    }

}
