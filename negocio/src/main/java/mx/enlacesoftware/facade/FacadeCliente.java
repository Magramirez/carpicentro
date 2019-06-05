/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import java.util.List;
import mx.enlacesoftware.delegate.DelegateCliente;
import mx.enlacesoftware.entity.Cliente;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeCliente {
    
    private final DelegateCliente delegateCliente;

    public FacadeCliente() {
        this.delegateCliente = new DelegateCliente();
    }
    
    public boolean guardarCliente(Cliente cliente){
        return delegateCliente.saveCliente(cliente);
    }
    
     public boolean updateCliente(Cliente cliente){
        return delegateCliente.updateCliente(cliente);
    }
    
    public void deleteCliente(Cliente cliente){
        delegateCliente.deleteCliente(cliente);
    }
    
    public List<Cliente> Consultar(){
       List<Cliente> clientes = delegateCliente.Consulta();
       return clientes;
    }
}
