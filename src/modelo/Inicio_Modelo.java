/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Inicio_Controller;
import controlador.Opciones_Controller;
/**
 *
 * @author Usuario
 */
public class Inicio_Modelo {
    private String pin="1234";
    
    public void validarUsuario(String pinT){
        if (pin.equals(pinT)){
            Inicio_Controller.ocultarInicio();
            Opciones_Controller.mostrarOpciones();
        }
    }
}
