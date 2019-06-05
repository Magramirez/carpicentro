/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "evaluaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluaciones.findAll", query = "SELECT e FROM Evaluaciones e")
    , @NamedQuery(name = "Evaluaciones.findBySolicitudFolio", query = "SELECT e FROM Evaluaciones e WHERE e.solicitudFolio = :solicitudFolio")})
public class Evaluaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "solicitud_folio")
    private Integer solicitudFolio;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evaluaciones")
    private EvaluacionFabricacion evaluacionFabricacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evaluaciones")
    private EvaluacionLijado evaluacionLijado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evaluaciones")
    private EvaluacionPintura evaluacionPintura;
    @JoinColumn(name = "solicitud_folio", referencedColumnName = "folio", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Solicitud solicitud;

    public Evaluaciones() {
    }

    public Evaluaciones(Integer solicitudFolio) {
        this.solicitudFolio = solicitudFolio;
    }

    public Integer getSolicitudFolio() {
        return solicitudFolio;
    }

    public void setSolicitudFolio(Integer solicitudFolio) {
        this.solicitudFolio = solicitudFolio;
    }

    public EvaluacionFabricacion getEvaluacionFabricacion() {
        return evaluacionFabricacion;
    }

    public void setEvaluacionFabricacion(EvaluacionFabricacion evaluacionFabricacion) {
        this.evaluacionFabricacion = evaluacionFabricacion;
    }

    public EvaluacionLijado getEvaluacionLijado() {
        return evaluacionLijado;
    }

    public void setEvaluacionLijado(EvaluacionLijado evaluacionLijado) {
        this.evaluacionLijado = evaluacionLijado;
    }

    public EvaluacionPintura getEvaluacionPintura() {
        return evaluacionPintura;
    }

    public void setEvaluacionPintura(EvaluacionPintura evaluacionPintura) {
        this.evaluacionPintura = evaluacionPintura;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitudFolio != null ? solicitudFolio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluaciones)) {
            return false;
        }
        Evaluaciones other = (Evaluaciones) object;
        if ((this.solicitudFolio == null && other.solicitudFolio != null) || (this.solicitudFolio != null && !this.solicitudFolio.equals(other.solicitudFolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.Evaluaciones[ solicitudFolio=" + solicitudFolio + " ]";
    }
    
}
