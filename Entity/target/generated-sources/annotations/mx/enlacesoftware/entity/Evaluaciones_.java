package mx.enlacesoftware.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.enlacesoftware.entity.EvaluacionFabricacion;
import mx.enlacesoftware.entity.EvaluacionLijado;
import mx.enlacesoftware.entity.EvaluacionPintura;
import mx.enlacesoftware.entity.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T20:28:57")
@StaticMetamodel(Evaluaciones.class)
public class Evaluaciones_ { 

    public static volatile SingularAttribute<Evaluaciones, EvaluacionPintura> evaluacionPintura;
    public static volatile SingularAttribute<Evaluaciones, EvaluacionLijado> evaluacionLijado;
    public static volatile SingularAttribute<Evaluaciones, Solicitud> solicitud;
    public static volatile SingularAttribute<Evaluaciones, EvaluacionFabricacion> evaluacionFabricacion;
    public static volatile SingularAttribute<Evaluaciones, Integer> solicitudFolio;

}