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

    public DenunciaConductor(Conductor vivanuestroc, LocalDateTime fechaHora, int codigo, String causa, double importe) {
        super(fechaHora, codigo, causa, importe);
        this.vivanuestroc = vivanuestroc;
    }

    public Conductor getVivanuestroc() {
        return vivanuestroc;
    }

    public void setVivanuestroc(Conductor vivanuestroc) {
        this.vivanuestroc = vivanuestroc;
    }
    
}
