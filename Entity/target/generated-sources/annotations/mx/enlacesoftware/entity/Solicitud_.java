package mx.enlacesoftware.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.enlacesoftware.entity.Cliente;
import mx.enlacesoftware.entity.Evaluaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T20:28:57")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, Date> fecha;
    public static volatile SingularAttribute<Solicitud, String> estado;
    public static volatile SingularAttribute<Solicitud, Integer> numeroPlano;
    public static volatile SingularAttribute<Solicitud, String> tipoMadera;
    public static volatile SingularAttribute<Solicitud, String> color;
    public static volatile SingularAttribute<Solicitud, String> medida;
    public static volatile SingularAttribute<Solicitud, Cliente> clientenumeroCliente;
    public static volatile SingularAttribute<Solicitud, Integer> folio;
    public static volatile SingularAttribute<Solicitud, Date> fechaEntrega;
    public static volatile SingularAttribute<Solicitud, String> acabado;
    public static volatile SingularAttribute<Solicitud, Evaluaciones> evaluaciones;

}