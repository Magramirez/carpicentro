/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import java.util.List;
import mx.enlacesoftware.delegate.DelegateSolicitud;
import mx.enlacesoftware.entity.Cliente;
import mx.enlacesoftware.entity.Solicitud;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeSolicitud {
    
    private final DelegateSolicitud delegateSolicitud;

    public FacadeSolicitud() {
        this.delegateSolicitud = new DelegateSolicitud();
    }
    
    public void guardarSolicitud(Solicitud solicitud){
        delegateSolicitud.saveSolicitud(solicitud);
    }
    
     public void updateSolicitud(Solicitud solicitud){
        delegateSolicitud.updateSolicitud(solicitud);
    }
    
    public void deleteSolictud(Solicitud solicitud){
        delegateSolicitud.deleteSolicitud(solicitud);
    }
    
    public List<Solicitud> Consultar(){
       List<Solicitud> solicitudes = delegateSolicitud.Consulta();
       return solicitudes;
    }
}
