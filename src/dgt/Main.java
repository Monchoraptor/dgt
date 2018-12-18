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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SEstatal s=new SEstatal();
        Pantalla_Login pa = new Pantalla_Login(s);
        pa.setVisible(true);
    }
    
}
