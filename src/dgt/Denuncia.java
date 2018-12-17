/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.time.LocalDateTime;

/**
 *
 * @author GCM
 */
public class Denuncia {

private LocalDateTime fechaHora;
private int codigo;
private String causa;
private double importe;


public Denuncia(int a, String b, double c){
    codigo=a;
    causa=b;
    importe=c;
    fechaHora=LocalDateTime.now();
    
}
public Denuncia(int a, String b, double c, LocalDateTime d){
    this(a,b,c);
    fechaHora=d;
}
public double getImporte(){
    return importe;
}
public String getCausa(){
    return causa;
}
public LocalDateTime getFechaHora(){
    return fechaHora;
}
public int getCodigo(){
    return codigo;
}
public boolean equals(Denuncia d){
    if (this==d) return true;
    if (getClass()!=d.getClass()) return false;
    if (d==null) return false;
    Denuncia de = (Denuncia) d;
    return this.getCodigo()==de.getCodigo();
}

}
