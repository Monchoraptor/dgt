/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GCM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SEstatal s = new SEstatal();
        s.backup();
        try {
            s = SEstatal.restaurarBackup();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(s.getListadodgts().size());
        Pantalla_Login pa = new Pantalla_Login(s);
        pa.setVisible(true);
    }

}
