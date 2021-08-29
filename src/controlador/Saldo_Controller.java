/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Saldo;

/**
 *
 * @author Usuario
 */
public class Saldo_Controller {
    private static Saldo saldo= new Saldo();
    
    public static void mostrarOpciones(){
        saldo.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        saldo.setVisible(false);
    }
}
