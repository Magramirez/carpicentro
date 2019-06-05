/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import mx.enlacesoftware.entity.Usuario;
import mx.enlacesoftware.integracion.ServiceLocator;

/**
 *
 * @author Mario Argudin
 */
public class Test {
    public static void main(String[] args) {
        List<Usuario> resultado = ServiceLocator.getInstanceUsuarioDAO().findAll();
        for(Usuario res: resultado){
            System.out.println(res.getNombreUsuario());
        }
    }
}
