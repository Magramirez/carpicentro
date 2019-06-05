/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.integracion;

import mx.enlacesoftware.DAO.UsuarioDAO;
import mx.enlacesoftware.DAO.ClienteDAO;
import mx.enlacesoftware.DAO.EvaluacionFabricacionDAO;
import mx.enlacesoftware.DAO.EvaluacionLijadoDAO;
import mx.enlacesoftware.DAO.EvaluacionPinturaDAO;
import mx.enlacesoftware.DAO.EvaluacionesDAO;
import mx.enlacesoftware.DAO.SolicitudDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static ClienteDAO clienteDAO;
    private static UsuarioDAO usuarioDAO;
    private static SolicitudDAO solicitudDAO;
    private static EvaluacionesDAO evaluacionesDAO;
    private static EvaluacionLijadoDAO evaluacionlijadoDAO;
    private static EvaluacionFabricacionDAO evaluacionfabricacionDAO;
    private static EvaluacionPinturaDAO evaluacionpinturaDAO;
    /**
     * se crea la instancia para cliente DAO si esta no existe
     * @return 
     */
    public static ClienteDAO getInstanceClienteDAO(){
        if(clienteDAO == null){
            clienteDAO = new ClienteDAO();
            return clienteDAO;
        } else{
            return clienteDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     * @return 
     */
    public static UsuarioDAO getInstanceUsuarioDAO(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        } else{
            return usuarioDAO;
        }
    }
    
    public static SolicitudDAO getInstanceSolicitudDAO(){
        if(solicitudDAO == null){
            solicitudDAO = new SolicitudDAO();
            return solicitudDAO;
        } else{
            return solicitudDAO;
        }
    }
    
    public static EvaluacionesDAO getInstanceEvaluacionesDAO(){
        if(evaluacionesDAO == null){
            evaluacionesDAO = new EvaluacionesDAO();
            return evaluacionesDAO;
        } else{
            return evaluacionesDAO;
        }
    }
    
    public static EvaluacionLijadoDAO getInstanceEvaluacionLijadoDAO(){
        if(evaluacionlijadoDAO == null){
            evaluacionlijadoDAO = new EvaluacionLijadoDAO();
            return evaluacionlijadoDAO;
        } else{
            return evaluacionlijadoDAO;
        }
    }
    
    public static EvaluacionFabricacionDAO getInstanceEvaluacionFabricacionDAO(){
        if(evaluacionfabricacionDAO == null){
            evaluacionfabricacionDAO = new EvaluacionFabricacionDAO();
            return evaluacionfabricacionDAO;
        } else{
            return evaluacionfabricacionDAO;
        }
    }
    
    public static EvaluacionPinturaDAO getInstanceEvaluacionPinturaDAO(){
        if(evaluacionpinturaDAO == null){
            evaluacionpinturaDAO = new EvaluacionPinturaDAO();
            return evaluacionpinturaDAO;
        } else{
            return evaluacionpinturaDAO;
        }
    }  
}
