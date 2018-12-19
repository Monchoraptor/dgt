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

    private Conductor vivanuestroc;

    public DenunciaConductor(LocalDateTime a, String c, double d, Conductor e) {
        super(a, c, d);
        vivanuestroc= e;
    }

    public DenunciaConductor(LocalDateTime a, String c, Conductor e) {
        super(a, c);
        vivanuestroc = e;
    }
    public DenunciaConductor(Denuncia den, Conductor e){
        super(den.getFechaHora(), den.getCausa(), den.getImporte());
        vivanuestroc=e;
    }

}
