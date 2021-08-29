/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Opciones;

/**
 *
 * @author Usuario
 */
public class Opciones_Controller {
    private static Opciones opciones= new Opciones();
    
    public static void mostrarOpciones(){
        opciones.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        opciones.setVisible(false);
    }
}
