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
public class Usuario {
    private String user;
    private String pass;
    private Tipo type;
    
    
    public Usuario (String a, String b){
        user=a;
        pass=b;
        type= Tipo.setTipo();
    }
    public Usuario (String a, String b, String c){
        this(a,b);
        type= Tipo.setTipo(c);
    }
    
    
}
