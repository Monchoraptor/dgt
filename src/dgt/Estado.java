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
public enum Estado {
    SANCIONADO, EJECUCION, SOBRESEIDO;

    public static Estado getEJECUCION() {
        return EJECUCION;
    }

    public static Estado getSANCIONADO() {
        return SANCIONADO;
    }

    public static Estado getSOBRESEIDO() {
        return SOBRESEIDO;
    }
}
