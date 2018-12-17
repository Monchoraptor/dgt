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
    
    public Coche(String a, String b, String c,Conductor d){
        super(a,b);
        modelo=c;
        habitual=d;
    }
}
