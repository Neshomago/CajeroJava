package controlador;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import vista.Deposito;

public class Deposito_Controller {
    private static Deposito deposito= new Deposito();
    
    public static void mostrarOpciones(){
        deposito.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        deposito.setVisible(false);
    }
    
    public static int depositoCajero(int saldo, int valor){
        saldo = saldo + valor;
        System.out.println("VALOR + RESTADO: "+saldo);
        Main.cliente.setSaldo(saldo);
        return saldo;
    }
}
