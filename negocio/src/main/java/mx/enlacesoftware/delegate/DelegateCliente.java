/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.delegate;

import java.util.List;
import mx.enlacesoftware.entity.Cliente;
import mx.enlacesoftware.integracion.ServiceLocator;

/**
 *
 * @author Enrique Luna <>
 */
public class DelegateCliente {
    
    /**
     * @param cliente de tipo usuario con id 0 para que se cree un id nuevo
     * @return 
     */
    //Registro
    public boolean saveCliente(Cliente cliente){
        
        boolean repetido = false;
        List<Cliente> clientes = ServiceLocator.getInstanceClienteDAO().findAll();
        
        for(Cliente clien : clientes)
            if(cliente.getRfc().equalsIgnoreCase(clien.getRfc()))
                repetido = true;
        
        //Solo registra si no esta repetido el RFC
        if(!repetido)
            ServiceLocator.getInstanceClienteDAO().save(cliente);        

        return repetido;
    }
    
    //Consulta de clientes
    public List<Cliente> Consulta(){
        List<Cliente> clientes = ServiceLocator.getInstanceClienteDAO().findAll();
        
        return clientes;
    }
    
    //Actualizar cliente
    public boolean updateCliente(Cliente cliente){
        List<Cliente> clientes = ServiceLocator.getInstanceClienteDAO().findAll();
        boolean repetido = false;
        
        //Verifica que el RFC sea diferente.
        //Si hay una coincidencia con otro profesor que no sea el mismo, repetido sera verdadero y no actualizara
        for(Cliente clien : clientes)
            if((clien.getRfc().equalsIgnoreCase(clien.getRfc())) && !clien.getNumeroCliente().equals(cliente.getNumeroCliente()))
                repetido = true;
            
        if(!repetido)
            ServiceLocator.getInstanceClienteDAO().update(cliente);
        
        return repetido;
    }
    
    //Borrar cliente
    public void deleteCliente(Cliente cliente){
        ServiceLocator.getInstanceClienteDAO().delete(cliente);
    }
    
    //Buscar cliente
    public Cliente findNombre(int numero){
        Cliente cliente = new Cliente();
        List<Cliente> clientes = ServiceLocator.getInstanceClienteDAO().findAll();
        for(Cliente clien : clientes){
            if(clien.getNumeroCliente() == numero){
                cliente = clien;
            }
        }
        return cliente;
    }
    
}
