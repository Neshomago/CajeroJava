package controlador;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import vista.Retiro;

public class Retiro_Controller {
    private static Retiro retiro= new Retiro();
    
    public static int saldofinal = Main.cliente.getSaldo();
    
    public static void mostrarOpciones(){
        retiro.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        retiro.setVisible(false);
    }
    
    public static int retiroCajero(int saldo, int valor){
        saldo = saldo - valor;
        System.out.println("VALOR - RESTADO: "+saldo);
        Main.cliente.setSaldo(saldo);
        return saldo;
    }
}
