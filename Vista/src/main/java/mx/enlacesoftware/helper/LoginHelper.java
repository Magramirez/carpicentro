/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.enlacesoftware.entity.Usuario;
import mx.enlacesoftware.integracion.ServiceFacadeLocator;

/**
 *
 * @author Enrique
 */
public class LoginHelper implements Serializable{
    

    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param nombreUsuario
     * @param contrasena
     * @param tipoUsuario
     * @return 
     */
    public Usuario Login(String contrasena, String nombreUsuario, String tipoUsuario){
        return ServiceFacadeLocator.getInstanceFacadeUsuario().login(nombreUsuario,contrasena,tipoUsuario);
    }
    
    
    
}
