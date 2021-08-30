package controlador;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class Main {
    
    public static Cliente cliente = new Cliente();
    
    public static String name,pin;
    
    public static void validarCliente(String pin){
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
        cliente.setNombreCliente("Andres");
        cliente.setPinCodigo("1234");
        cliente.setSaldo(20000);
        
        Inicio_Controller.mostrarInicio();
        System.out.println(cliente.getNombreCliente());
    }
}
