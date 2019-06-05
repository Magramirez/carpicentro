/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "evaluacion_fabricacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionFabricacion.findAll", query = "SELECT e FROM EvaluacionFabricacion e")
    , @NamedQuery(name = "EvaluacionFabricacion.findByEvalucionesSolicitudFolio", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.evalucionesSolicitudFolio = :evalucionesSolicitudFolio")
    , @NamedQuery(name = "EvaluacionFabricacion.findBySuperficieMadera", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.superficieMadera = :superficieMadera")
    , @NamedQuery(name = "EvaluacionFabricacion.findByComentarioSuperficie", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.comentarioSuperficie = :comentarioSuperficie")
    , @NamedQuery(name = "EvaluacionFabricacion.findByImperfeccionMadera", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.imperfeccionMadera = :imperfeccionMadera")
    , @NamedQuery(name = "EvaluacionFabricacion.findByComentarioImperfeccion", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.comentarioImperfeccion = :comentarioImperfeccion")
    , @NamedQuery(name = "EvaluacionFabricacion.findByTipoMadera", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.tipoMadera = :tipoMadera")
    , @NamedQuery(name = "EvaluacionFabricacion.findByComentarioTipoMadera", query = "SELECT e FROM EvaluacionFabricacion e WHERE e.comentarioTipoMadera = :comentarioTipoMadera")})
public class EvaluacionFabricacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "evaluciones_solicitud_folio")
    private Integer evalucionesSolicitudFolio;
    @Basic(optional = false)
    @Column(name = "superficieMadera")
    private boolean superficieMadera;
    @Basic(optional = false)
    @Column(name = "comentarioSuperficie")
    private String comentarioSuperficie;
    @Basic(optional = false)
    @Column(name = "imperfeccionMadera")
    private boolean imperfeccionMadera;
    @Basic(optional = false)
    @Column(name = "comentarioImperfeccion")
    private String comentarioImperfeccion;
    @Basic(optional = false)
    @Column(name = "tipoMadera")
    private boolean tipoMadera;
    @Basic(optional = false)
    @Column(name = "comentarioTipoMadera")
    private String comentarioTipoMadera;
    @JoinColumn(name = "evaluciones_solicitud_folio", referencedColumnName = "solicitud_folio", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evaluaciones evaluaciones;

    public EvaluacionFabricacion() {
    }

    public EvaluacionFabricacion(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public EvaluacionFabricacion(Integer evalucionesSolicitudFolio, boolean superficieMadera, String comentarioSuperficie, boolean imperfeccionMadera, String comentarioImperfeccion, boolean tipoMadera, String comentarioTipoMadera) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
        this.superficieMadera = superficieMadera;
        this.comentarioSuperficie = comentarioSuperficie;
        this.imperfeccionMadera = imperfeccionMadera;
        this.comentarioImperfeccion = comentarioImperfeccion;
        this.tipoMadera = tipoMadera;
        this.comentarioTipoMadera = comentarioTipoMadera;
    }

    public Integer getEvalucionesSolicitudFolio() {
        return evalucionesSolicitudFolio;
    }

    public void setEvalucionesSolicitudFolio(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public boolean getSuperficieMadera() {
        return superficieMadera;
    }

    public void setSuperficieMadera(boolean superficieMadera) {
        this.superficieMadera = superficieMadera;
    }

    public String getComentarioSuperficie() {
        return comentarioSuperficie;
    }

    public void setComentarioSuperficie(String comentarioSuperficie) {
        this.comentarioSuperficie = comentarioSuperficie;
    }

    public boolean getImperfeccionMadera() {
        return imperfeccionMadera;
    }

    public void setImperfeccionMadera(boolean imperfeccionMadera) {
        this.imperfeccionMadera = imperfeccionMadera;
    }

    public String getComentarioImperfeccion() {
        return comentarioImperfeccion;
    }

    public void setComentarioImperfeccion(String comentarioImperfeccion) {
        this.comentarioImperfeccion = comentarioImperfeccion;
    }

    public boolean getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(boolean tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getComentarioTipoMadera() {
        return comentarioTipoMadera;
    }

    public void setComentarioTipoMadera(String comentarioTipoMadera) {
        this.comentarioTipoMadera = comentarioTipoMadera;
    }

    public Evaluaciones getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Evaluaciones evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evalucionesSolicitudFolio != null ? evalucionesSolicitudFolio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionFabricacion)) {
            return false;
        }
        EvaluacionFabricacion other = (EvaluacionFabricacion) object;
        if ((this.evalucionesSolicitudFolio == null && other.evalucionesSolicitudFolio != null) || (this.evalucionesSolicitudFolio != null && !this.evalucionesSolicitudFolio.equals(other.evalucionesSolicitudFolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.EvaluacionFabricacion[ evalucionesSolicitudFolio=" + evalucionesSolicitudFolio + " ]";
    }
    
}
