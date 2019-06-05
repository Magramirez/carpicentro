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
import mx.enlacesoftware.entity.Solicitud;
import mx.enlacesoftware.helper.SolicitudHelper;
/**
 *
 * @author enrique
 */

@ManagedBean(name = "solicitudUI")
@SessionScoped
public class SolicitudBeanUI implements Serializable {
    private SolicitudHelper  solicitudHelper;
    private Solicitud solicitud;
    private List<Solicitud> val1;
    private List<Solicitud> val2;
    private List<Solicitud> filtro;
    private Solicitud solicitudSelect;
      
    public SolicitudBeanUI() throws IOException{
        solicitudHelper = new SolicitudHelper();
        solicitud = new Solicitud();
        val1 = consulta();
        val2 = consulta();
       
    }
    
     /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
      @PostConstruct
    public void init(){
        solicitud = new Solicitud();
       
    }

     public void registro() throws IOException{
     
        // los atributos de usuario vienen del xhtml 
//        cliente.setNumeroCliente();
//        cliente.setNombreCliente();
//        cliente.setApellidoPaternoCliente();
//        cliente.setApellidoMaternoCliente();
//        cliente.setDireccion();
//        cliente.setCorreoElectronico();
//        cliente.setTelefonoCliente();
//        cliente.setCelularCliente();
//        cliente.setRfc();
       
        solicitudHelper.Registro(solicitud);
        
     }
     
     public void eliminar() throws IOException{
         
         solicitudHelper.eliminar(solicitudSelect);
     }
     
     public List<Solicitud> consulta() throws IOException{
         List<Solicitud> solicitudes = solicitudHelper.Consulta();
        return solicitudes;
     }
     
     public void modificar() throws IOException{
         
         solicitudHelper.modificar(solicitudSelect);
     }
    
     public void registrar() {
         String appURL = "";     
     }  

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Solicitud> getVal1() {
        return val1;
    }

    public void setVal1(List<Solicitud> val1) {
        this.val1 = val1;
    }

    public List<Solicitud> getVal2() {
        return val2;
    }

    public void setVal2(List<Solicitud> val2) {
        this.val2 = val2;
    }

    public List<Solicitud> getFiltro() {
        return filtro;
    }

    public void setFiltro(List<Solicitud> filtro) {
        this.filtro = filtro;
    }

    public Solicitud getSolicitudSelect() {
        return solicitudSelect;
    }

    public void setSolicitudSelect(Solicitud solicitudSelect) {
        this.solicitudSelect = solicitudSelect;
    }
     
     
}