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
@Table(name = "evaluacion_pintura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionPintura.findAll", query = "SELECT e FROM EvaluacionPintura e")
    , @NamedQuery(name = "EvaluacionPintura.findByEvalucionesSolicitudFolio", query = "SELECT e FROM EvaluacionPintura e WHERE e.evalucionesSolicitudFolio = :evalucionesSolicitudFolio")
    , @NamedQuery(name = "EvaluacionPintura.findByTinteMadera", query = "SELECT e FROM EvaluacionPintura e WHERE e.tinteMadera = :tinteMadera")
    , @NamedQuery(name = "EvaluacionPintura.findByComentarioTinte", query = "SELECT e FROM EvaluacionPintura e WHERE e.comentarioTinte = :comentarioTinte")
    , @NamedQuery(name = "EvaluacionPintura.findByAcabadoMadera", query = "SELECT e FROM EvaluacionPintura e WHERE e.acabadoMadera = :acabadoMadera")
    , @NamedQuery(name = "EvaluacionPintura.findByComentarioAcabado", query = "SELECT e FROM EvaluacionPintura e WHERE e.comentarioAcabado = :comentarioAcabado")
    , @NamedQuery(name = "EvaluacionPintura.findByDetalladoMadera", query = "SELECT e FROM EvaluacionPintura e WHERE e.detalladoMadera = :detalladoMadera")
    , @NamedQuery(name = "EvaluacionPintura.findByComentarioDetallado", query = "SELECT e FROM EvaluacionPintura e WHERE e.comentarioDetallado = :comentarioDetallado")})
public class EvaluacionPintura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "evaluciones_solicitud_folio")
    private Integer evalucionesSolicitudFolio;
    @Basic(optional = false)
    @Column(name = "tinteMadera")
    private boolean tinteMadera;
    @Basic(optional = false)
    @Column(name = "comentarioTinte")
    private String comentarioTinte;
    @Basic(optional = false)
    @Column(name = "acabadoMadera")
    private boolean acabadoMadera;
    @Basic(optional = false)
    @Column(name = "comentarioAcabado")
    private String comentarioAcabado;
    @Basic(optional = false)
    @Column(name = "detalladoMadera")
    private boolean detalladoMadera;
    @Basic(optional = false)
    @Column(name = "comentarioDetallado")
    private String comentarioDetallado;
    @JoinColumn(name = "evaluciones_solicitud_folio", referencedColumnName = "solicitud_folio", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evaluaciones evaluaciones;

    public EvaluacionPintura() {
    }

    public EvaluacionPintura(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public EvaluacionPintura(Integer evalucionesSolicitudFolio, boolean tinteMadera, String comentarioTinte, boolean acabadoMadera, String comentarioAcabado, boolean detalladoMadera, String comentarioDetallado) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
        this.tinteMadera = tinteMadera;
        this.comentarioTinte = comentarioTinte;
        this.acabadoMadera = acabadoMadera;
        this.comentarioAcabado = comentarioAcabado;
        this.detalladoMadera = detalladoMadera;
        this.comentarioDetallado = comentarioDetallado;
    }

    public Integer getEvalucionesSolicitudFolio() {
        return evalucionesSolicitudFolio;
    }

    public void setEvalucionesSolicitudFolio(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public boolean getTinteMadera() {
        return tinteMadera;
    }

    public void setTinteMadera(boolean tinteMadera) {
        this.tinteMadera = tinteMadera;
    }

    public String getComentarioTinte() {
        return comentarioTinte;
    }

    public void setComentarioTinte(String comentarioTinte) {
        this.comentarioTinte = comentarioTinte;
    }

    public boolean getAcabadoMadera() {
        return acabadoMadera;
    }

    public void setAcabadoMadera(boolean acabadoMadera) {
        this.acabadoMadera = acabadoMadera;
    }

    public String getComentarioAcabado() {
        return comentarioAcabado;
    }

    public void setComentarioAcabado(String comentarioAcabado) {
        this.comentarioAcabado = comentarioAcabado;
    }

    public boolean getDetalladoMadera() {
        return detalladoMadera;
    }

    public void setDetalladoMadera(boolean detalladoMadera) {
        this.detalladoMadera = detalladoMadera;
    }

    public String getComentarioDetallado() {
        return comentarioDetallado;
    }

    public void setComentarioDetallado(String comentarioDetallado) {
        this.comentarioDetallado = comentarioDetallado;
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
        if (!(object instanceof EvaluacionPintura)) {
            return false;
        }
        EvaluacionPintura other = (EvaluacionPintura) object;
        if ((this.evalucionesSolicitudFolio == null && other.evalucionesSolicitudFolio != null) || (this.evalucionesSolicitudFolio != null && !this.evalucionesSolicitudFolio.equals(other.evalucionesSolicitudFolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.EvaluacionPintura[ evalucionesSolicitudFolio=" + evalucionesSolicitudFolio + " ]";
    }
    
}
