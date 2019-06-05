/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import mx.enlacesoftware.delegate.DelegateEvaluacionFabricacion;
import mx.enlacesoftware.entity.EvaluacionFabricacion;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeEvaluacionFabricacion {
    
    private final DelegateEvaluacionFabricacion delegateEvaluacionFabricacion;

    public FacadeEvaluacionFabricacion() {
        this.delegateEvaluacionFabricacion = new DelegateEvaluacionFabricacion();
    }
    
    public void guardarEvaluacionFabricacion(EvaluacionFabricacion evaluacionfabricacion){
        delegateEvaluacionFabricacion.saveEvaluacionFabricacion(evaluacionfabricacion);
    }
    
}
