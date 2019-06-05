/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.delegate;

import java.util.List;
import mx.enlacesoftware.entity.Solicitud;
import mx.enlacesoftware.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateSolicitud {
    
    /**
     * Metodo de ejemplo para guardar Alumno
     * @param solicitud de tipo usuario con id 0 para que se cree un id nuevo
     */
    
    //Registro
    public void saveSolicitud(Solicitud solicitud){
        ServiceLocator.getInstanceSolicitudDAO().save(solicitud);
    }
   
    //Consulta de solicitud
    public List<Solicitud> Consulta(){
        List<Solicitud> solicitudes = ServiceLocator.getInstanceSolicitudDAO().findAll();
        
        return solicitudes;
    }
    
    //Actualizar solicitud
    public void updateSolicitud(Solicitud solicitud){      
        ServiceLocator.getInstanceSolicitudDAO().update(solicitud);
    }
    
    //Borrar solicitud
    public void deleteSolicitud(Solicitud solicitud){
        ServiceLocator.getInstanceSolicitudDAO().delete(solicitud);
    }
    
    //Buscar solicitud
    public Solicitud findNumero(int numero){
        Solicitud solicitud = new Solicitud();
        List<Solicitud> solicitudes = ServiceLocator.getInstanceSolicitudDAO().findAll();
        for(Solicitud soli : solicitudes){
            if(soli.getFolio() == numero){
                solicitud = soli;
            }
        }
        return solicitud;
    }
}