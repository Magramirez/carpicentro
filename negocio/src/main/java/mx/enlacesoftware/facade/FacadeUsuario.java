/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import mx.enlacesoftware.delegate.DelegateUsuario;
import mx.enlacesoftware.entity.Usuario;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeUsuario {
    
    private final DelegateUsuario delegateUsuario;

    public FacadeUsuario() {
        this.delegateUsuario = new DelegateUsuario();
    }
    
     /**
     * Metodo para verificar si el usuario esta registrado en la bd
     * @param contrasena
     * @param nombreUsuario
     * @param tipoUsuario
     * @return Regresa usuario si el correo y contrasena con correctos
     */
    public Usuario login(String contrasena, String nombreUsuario, String tipoUsuario){
        return delegateUsuario.login(contrasena, nombreUsuario, tipoUsuario);
    }
    
    /**
     * Metodo de ejemplo para guardar Usuario
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUsario(Usuario usuario){
        delegateUsuario.saveUsario(usuario);
    }
    
}
