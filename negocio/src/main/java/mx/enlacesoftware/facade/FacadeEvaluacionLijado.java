/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import mx.enlacesoftware.delegate.DelegateEvaluacionLijado;
import mx.enlacesoftware.entity.EvaluacionLijado;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeEvaluacionLijado {
    
    private final DelegateEvaluacionLijado delegateEvaluacionLijado;

    public FacadeEvaluacionLijado() {
        this.delegateEvaluacionLijado = new DelegateEvaluacionLijado();
    }
    
    public void guardarEvaluacionPintura(EvaluacionLijado evaluacionlijado){
        delegateEvaluacionLijado.saveEvaluacionLijado(evaluacionlijado);
    }
    
}