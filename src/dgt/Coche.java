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
    public String toString(){
        return "Coche --> " + "Modelo: " + modelo + " ,  Color: " + this.getColor() + " ,  Matricula: " + this.getMatricula() + " , Conductor Habitual: " + habitual;
    }

}
