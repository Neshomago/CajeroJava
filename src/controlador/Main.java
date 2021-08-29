/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void validarCliente(String pin){
        Cliente cliente=new Cliente();
        cliente.setNombreCliente("Andres");
        cliente.setPinCodigo("1234");
        cliente.setSaldo(20000f);
        
        if (pin.equals(cliente.getPinCodigo())){
            JOptionPane.showMessageDialog(null, "Pin Correcto", "Acceso",INFORMATION_MESSAGE);
            System.out.println("Pass correcto " + cliente.getNombreCliente());
            Inicio_Controller.ocultarInicio();
            Opciones_Controller.mostrarOpciones();
        }else{
            JOptionPane.showMessageDialog(null, "¡Pin Incorrecto!", "Acceso",ERROR_MESSAGE);
            System.out.println("Pass Incorrecto");
        }
    }
    
    public static void salidaSistema(){
        JOptionPane.showMessageDialog(null, "¡Gracias por su vista hoy!", "Saliendo del sistema", INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    public static void main(String[] args){
        Inicio_Controller.mostrarInicio();
    }
}
