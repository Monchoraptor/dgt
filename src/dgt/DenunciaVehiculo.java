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
public class DenunciaVehiculo extends Denuncia {

    private Vehiculo vehiculo;
    
    

    public DenunciaVehiculo(Vehiculo vehiculo, LocalDateTime fechaHora, String causa, double importe) {
        super(fechaHora, causa, importe);
        this.vehiculo = vehiculo;
    }
    
    public String toString(){
        return "Vehiculo denunciado: "  +  this.super().toString() + this.vehiculo.toString() + this.super().toString()+ " . \n";
    }
    
  
    
}
