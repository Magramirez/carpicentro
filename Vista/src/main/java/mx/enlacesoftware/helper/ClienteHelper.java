/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.helper;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import mx.enlacesoftware.delegate.DelegateCliente;
import mx.enlacesoftware.facade.FacadeCliente;
import mx.enlacesoftware.entity.Cliente;
import mx.enlacesoftware.integracion.ServiceFacadeLocator;

/**
 *
 * @author enrique
 */

public class ClienteHelper implements Serializable{
    
   Cliente cliente;
    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param cliente
    
     * @return 
     */
    public Cliente Registro(Cliente cliente){
       ServiceFacadeLocator.getInstanceFacadeCliente().guardarCliente(cliente);
       return null;
        
    }
    public Cliente eliminar(Cliente cliente){
        ServiceFacadeLocator.getInstanceFacadeCliente().deleteCliente(cliente);
        return null;
    }
    
    public Cliente modificar(Cliente cliente){
        ServiceFacadeLocator.getInstanceFacadeCliente().updateCliente(cliente);
        return null;
    }
    
    public List<Cliente> Consulta(){
        List<Cliente> clientes = ServiceFacadeLocator.getInstanceFacadeCliente().Consultar();
       return clientes;
        
    }
    
}