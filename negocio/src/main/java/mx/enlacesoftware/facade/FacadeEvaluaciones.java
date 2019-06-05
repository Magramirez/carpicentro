/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import mx.enlacesoftware.delegate.DelegateEvaluaciones;
import mx.enlacesoftware.entity.Evaluaciones;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeEvaluaciones {
    
    private final DelegateEvaluaciones delegateEvaluaciones;

    public FacadeEvaluaciones() {
        this.delegateEvaluaciones = new DelegateEvaluaciones();
    }
    
    public void guardarEvaluaciones(Evaluaciones evaluaciones){
        delegateEvaluaciones.saveEvaluaciones(evaluaciones);
    }
    
}
