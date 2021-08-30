package controlador;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import vista.Retiro;

public class Retiro_Controller {
    private static Retiro retiro= new Retiro();
    
    public static void mostrarOpciones(){
        retiro.setVisible(true);
    }
    
    public static void ocultarOpciones(){
        retiro.setVisible(false);
    }
    
    public static int retiroCajero(int saldo, int valor){
        try{
            if(saldo <=0){
                JOptionPane.showMessageDialog(null,"¡Fondos insuficientes!","Retiro",ERROR_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(retiro, e);
            saldo = saldo - valor;
            System.out.println("VALOR - RESTADO: "+saldo);
            return saldo;
        }
        return 0;
    }
}
