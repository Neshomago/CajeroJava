/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Retiro;

/**
 *
 * @author Usuario
 */
public class Retiro_Controller {
    private static Retiro retiro= new Retiro();
    
    public static void mostrarOpciones(){
        retiro.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        retiro.setVisible(false);
    }
}
