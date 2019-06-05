package mx.enlacesoftware.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.enlacesoftware.entity.Evaluaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T20:28:57")
@StaticMetamodel(EvaluacionFabricacion.class)
public class EvaluacionFabricacion_ { 

    public static volatile SingularAttribute<EvaluacionFabricacion, Boolean> superficieMadera;
    public static volatile SingularAttribute<EvaluacionFabricacion, String> comentarioSuperficie;
    public static volatile SingularAttribute<EvaluacionFabricacion, Boolean> tipoMadera;
    public static volatile SingularAttribute<EvaluacionFabricacion, Boolean> imperfeccionMadera;
    public static volatile SingularAttribute<EvaluacionFabricacion, String> comentarioImperfeccion;
    public static volatile SingularAttribute<EvaluacionFabricacion, Integer> evalucionesSolicitudFolio;
    public static volatile SingularAttribute<EvaluacionFabricacion, String> comentarioTipoMadera;
    public static volatile SingularAttribute<EvaluacionFabricacion, Evaluaciones> evaluaciones;

}