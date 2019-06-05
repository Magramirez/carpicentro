/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.facade;

import mx.enlacesoftware.delegate.DelegateEvaluacionPintura;
import mx.enlacesoftware.entity.EvaluacionPintura;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeEvaluacionPintura {
    
    private final DelegateEvaluacionPintura delegateEvaluacionPintura;

    public FacadeEvaluacionPintura() {
        this.delegateEvaluacionPintura = new DelegateEvaluacionPintura();
    }
    
    public void guardarEvaluacionPintura(EvaluacionPintura evaluacionpintura){
        delegateEvaluacionPintura.saveEvaluacionPintura(evaluacionpintura);
    }
    
}