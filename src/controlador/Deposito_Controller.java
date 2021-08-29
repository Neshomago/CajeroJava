/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Deposito;

/**
 *
 * @author Usuario
 */
public class Deposito_Controller {
    private static Deposito deposito= new Deposito();
    
    public static void mostrarOpciones(){
        deposito.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        deposito.setVisible(false);
    }
}
