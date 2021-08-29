/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cajero_Controller {
    
    private List<Cliente> clientes = new LinkedList<>();
    
    public Cliente login(String pin){
        Cliente cliente_logged=null;
        for(Cliente cliente: clientes){
            if(cliente.getPinCodigo().equals(pin)){
                cliente_logged=cliente;
            }
            break;
        }
        return cliente_logged;
    }
    
    public float consulta(Cliente cliente){
        return cliente.getSaldo();
    }
    
    public boolean retirar(Cliente cliente, float retiro){
        boolean confirmacion=false;
        if(cliente.getSaldo()>=retiro){
            cliente.getSaldo(cliente.getSaldo()-retiro);
            confirmacion=true;
        }
        return confirmacion;
    }
    
    public float deposito(Cliente cliente, float deposito){
        cliente.getSaldo(cliente.getSaldo()+deposito);
        return cliente.getSaldo();
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
