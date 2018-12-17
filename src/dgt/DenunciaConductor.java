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
public class DenunciaConductor extends Denuncia {
    private int numeroCarnet;
    
public DenunciaConductor(int a, String b, double c, LocalDateTime d, int e){
    super(a,b,c,d);
    numeroCarnet=e;
}
public DenunciaConductor(int a, String b, double c, int e){
    super(a,b,c);
    numeroCarnet=e;
}
    
}
