/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Inicio_Modelo;
import vista.Inicio;

/**
 *
 * @author Usuario
 */
public class Inicio_Controller {
        private static Inicio inicio= new Inicio();
    
    public static void mostrarInicio(){
        inicio.setVisible(true);
    }
    
    public static void ocultarInicio(){
        inicio.setVisible(false);
    }
    
    public static void validarPin(String pin){
        Inicio_Modelo Pin=new Inicio_Modelo();
        Pin.validarUsuario(pin);
    }
}
