package mx.enlacesoftware.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.enlacesoftware.entity.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T20:28:57")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidoPaternoCliente;
    public static volatile SingularAttribute<Cliente, String> nombreCliente;
    public static volatile SingularAttribute<Cliente, String> apellidoMaternoCliente;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, Integer> numeroCliente;
    public static volatile SingularAttribute<Cliente, Integer> telefonoCliente;
    public static volatile SingularAttribute<Cliente, Integer> celularCliente;
    public static volatile ListAttribute<Cliente, Solicitud> solicitudList;
    public static volatile SingularAttribute<Cliente, String> correoElectronico;
    public static volatile SingularAttribute<Cliente, String> rfc;

}