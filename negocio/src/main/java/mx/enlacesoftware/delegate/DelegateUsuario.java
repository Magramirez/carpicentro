/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.delegate;

import java.util.List;
import mx.enlacesoftware.entity.Usuario;
import mx.enlacesoftware.integracion.ServiceLocator;



public class DelegateUsuario {
    
    /**
     * Metodo para verificar si el usuario esta registrado en la bd
     * @param contrasena
     * @param nombreUsuario
     * @param tipoUsuario
     * @return un tipo usuario si no encuntra el usuario sera null
     */
    public Usuario login(String contrasena, String nombreUsuario, String tipoUsuario){
        Usuario usuario = new Usuario();
        List<Usuario> usuarios = ServiceLocator.getInstanceUsuarioDAO().findAll();
        
        for(Usuario us:usuarios){
            if(us.getContrasena().equalsIgnoreCase(contrasena) && us.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && us.getTipoUsuario().equalsIgnoreCase(tipoUsuario)){
                usuario = us;
            }
        }
        return usuario;
    }
    
    /**
     * Metodo de ejemplo para guardar Usuario
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUsario(Usuario usuario){
        ServiceLocator.getInstanceUsuarioDAO().save(usuario);
    }
    
}
