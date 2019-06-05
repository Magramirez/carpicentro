/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.delegate;

import mx.enlacesoftware.entity.EvaluacionLijado;
import mx.enlacesoftware.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateEvaluacionLijado {
    
    /**
     * @param evaluacionlijado de tipo usuario con id 0 para que se cree un id nuevo
     */
    public void saveEvaluacionLijado(EvaluacionLijado evaluacionlijado){
        ServiceLocator.getInstanceEvaluacionLijadoDAO().save(evaluacionlijado);
    }
    
}