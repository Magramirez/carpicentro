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
import mx.enlacesoftware.delegate.DelegateSolicitud;
import mx.enlacesoftware.facade.FacadeSolicitud;
import mx.enlacesoftware.entity.Solicitud;
import mx.enlacesoftware.integracion.ServiceFacadeLocator;

/**
 *
 * @author enrique
 */

public class SolicitudHelper implements Serializable{
    
   Solicitud solicitud;
    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param solicitud
    
     * @return 
     */
    public Solicitud Registro(Solicitud solicitud){
       ServiceFacadeLocator.getInstanceFacadeSolicitud().guardarSolicitud(solicitud);
       return null;
        
    }
    public Solicitud eliminar(Solicitud solicitud){
        ServiceFacadeLocator.getInstanceFacadeSolicitud().deleteSolictud(solicitud);
        return null;
    }
    
    public Solicitud modificar(Solicitud solicitud){
        ServiceFacadeLocator.getInstanceFacadeSolicitud().updateSolicitud(solicitud);
        return null;
    }
    
    public List<Solicitud> Consulta(){
        List<Solicitud> solicitudes = ServiceFacadeLocator.getInstanceFacadeSolicitud().Consultar();
       return solicitudes;
        
    }
    
}
