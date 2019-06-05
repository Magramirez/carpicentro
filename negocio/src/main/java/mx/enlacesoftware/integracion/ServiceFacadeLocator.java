/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.integracion;

import mx.enlacesoftware.facade.FacadeCliente;
import mx.enlacesoftware.facade.FacadeUsuario;
import mx.enlacesoftware.facade.FacadeSolicitud;

/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeCliente facadeCliente;
    private static FacadeUsuario facadeUsuario;
    private static FacadeSolicitud facadeSolicitud;
    
    public static FacadeCliente getInstanceFacadeCliente() {
        if (facadeCliente == null) {
            facadeCliente = new FacadeCliente();
            return facadeCliente;
        } else {
            return facadeCliente;
        }
    }
    
    public static FacadeUsuario getInstanceFacadeUsuario() {
        if (facadeUsuario == null) {
            facadeUsuario = new FacadeUsuario();
            return facadeUsuario;
        } else {
            return facadeUsuario;
        }
    }
    
    public static FacadeSolicitud getInstanceFacadeSolicitud() {
        if (facadeSolicitud == null) {
            facadeSolicitud = new FacadeSolicitud();
            return facadeSolicitud;
        } else {
            return facadeSolicitud;
        }
    }
}
