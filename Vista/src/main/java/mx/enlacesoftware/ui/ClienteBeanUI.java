/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.ui;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.enlacesoftware.entity.Cliente;
import mx.enlacesoftware.helper.ClienteHelper;
/**
 *
 * @author luisc
 */

@ManagedBean(name = "clienteUI")
@SessionScoped
public class ClienteBeanUI implements Serializable {
    private ClienteHelper  clienteHelper;
    private Cliente cliente;
    private List<Cliente> val1;
    private List<Cliente> val2;
    private List<Cliente> filtro;
    private Cliente clienteSelect;
      
    public ClienteBeanUI() throws IOException{
        clienteHelper = new ClienteHelper();
        cliente = new Cliente();
        val1 = consulta();
        val2 = consulta();
       
    }
    
     /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
      @PostConstruct
    public void init(){
        cliente = new Cliente();
       
    }

     public void registro() throws IOException{
     
//         los atributos de usuario vienen del xhtml 
//        cliente.setNumeroCliente();
//        cliente.setNombreCliente();
//        cliente.setApellidoPaternoCliente();
//        cliente.setApellidoMaternoCliente();
//        cliente.setDireccion();
//        cliente.setCorreoElectronico();
//        cliente.setTelefonoCliente();
//        cliente.setCelularCliente();
//        cliente.setRfc();
       
        clienteHelper.Registro(cliente);
        
     }
     
     public void eliminar() throws IOException{
         
         clienteHelper.eliminar(clienteSelect);
     }
     
     public List<Cliente> consulta() throws IOException{
         List<Cliente> clientes = clienteHelper.Consulta();
        return clientes;
     }
     
     public void modificar() throws IOException{
         
         clienteHelper.modificar(clienteSelect);
     }
     
     
     public void registrar() {
         String appURL = "/xmanCliente.xhtml";     
     }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getVal1() {
        return val1;
    }

    public void setVal1(List<Cliente> val1) {
        this.val1 = val1;
    }

    public List<Cliente> getVal2() {
        return val2;
    }

    public void setVal2(List<Cliente> val2) {
        this.val2 = val2;
    }

    public List<Cliente> getFiltro() {
        return filtro;
    }

    public void setFiltro(List<Cliente> filtro) {
        this.filtro = filtro;
    }

    public Cliente getClienteSelect() {
        return clienteSelect;
    }

    public void setClienteSelect(Cliente clienteSelect) {
        this.clienteSelect = clienteSelect;
    }
    
   
}