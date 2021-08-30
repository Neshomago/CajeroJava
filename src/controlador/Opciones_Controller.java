package controlador;

import vista.Opciones;

public class Opciones_Controller {
    private static Opciones opciones= new Opciones();
    public String name= Main.cliente.getNombreCliente();
    
    public static void mostrarOpciones(){
        opciones.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        opciones.setVisible(false);
    }
}
