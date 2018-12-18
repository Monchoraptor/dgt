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

    public DenunciaVehiculo(String matricula, LocalDateTime fechaHora, int codigo, String causa, double importe) {
        super(fechaHora, codigo, causa, importe);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
