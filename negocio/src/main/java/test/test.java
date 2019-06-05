/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.enlacesoftware.entity.Usuario;
import mx.enlacesoftware.integracion.ServiceFacadeLocator;
import mx.enlacesoftware.integracion.ServiceLocator;

/**
 *
 * @author Enrique
 */
public class test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        usuario = ServiceFacadeLocator.getInstanceFacadeUsuario().login("enlace", "Enrique","Gerente");
        
        if(usuario.getTipoUsuario() != null){
            System.out.println("Usuario: "+usuario.getNombreUsuario());
        }
        else{
            System.out.println("No se encontro");
        }
    }
}
