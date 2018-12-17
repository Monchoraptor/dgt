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
    private String matricula;
    
public DenunciaVehiculo(int a, String b, double c, LocalDateTime d, String e){
    super(a,b,c,d);
    matricula=e;
}
public DenunciaVehiculo(int a, String b, double c, String e){    
   super(a,b,c);
    matricula=e;
}

}
