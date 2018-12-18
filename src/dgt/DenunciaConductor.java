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

    public DenunciaConductor(int a, String b, double c, LocalDateTime d, Conductor e) {
        super(a, b, c, d);
        vivanuestroc= e;
    }

    public DenunciaConductor(int a, String b, double c, Conductor e) {
        super(a, b, c);
        vivanuestroc = e;
    }

}
