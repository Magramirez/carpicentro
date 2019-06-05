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
@Table(name = "evaluacion_lijado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionLijado.findAll", query = "SELECT e FROM EvaluacionLijado e")
    , @NamedQuery(name = "EvaluacionLijado.findByEvalucionesSolicitudFolio", query = "SELECT e FROM EvaluacionLijado e WHERE e.evalucionesSolicitudFolio = :evalucionesSolicitudFolio")
    , @NamedQuery(name = "EvaluacionLijado.findBySuperficieLijada", query = "SELECT e FROM EvaluacionLijado e WHERE e.superficieLijada = :superficieLijada")
    , @NamedQuery(name = "EvaluacionLijado.findByComentarioSuperficieLijada", query = "SELECT e FROM EvaluacionLijado e WHERE e.comentarioSuperficieLijada = :comentarioSuperficieLijada")
    , @NamedQuery(name = "EvaluacionLijado.findByImperfeccionLijada", query = "SELECT e FROM EvaluacionLijado e WHERE e.imperfeccionLijada = :imperfeccionLijada")
    , @NamedQuery(name = "EvaluacionLijado.findByComentarioImperfeccionLijada", query = "SELECT e FROM EvaluacionLijado e WHERE e.comentarioImperfeccionLijada = :comentarioImperfeccionLijada")})
public class EvaluacionLijado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "evaluciones_solicitud_folio")
    private Integer evalucionesSolicitudFolio;
    @Basic(optional = false)
    @Column(name = "superficieLijada")
    private boolean superficieLijada;
    @Basic(optional = false)
    @Column(name = "comentarioSuperficieLijada")
    private String comentarioSuperficieLijada;
    @Basic(optional = false)
    @Column(name = "imperfeccionLijada")
    private boolean imperfeccionLijada;
    @Basic(optional = false)
    @Column(name = "comentarioImperfeccionLijada")
    private String comentarioImperfeccionLijada;
    @JoinColumn(name = "evaluciones_solicitud_folio", referencedColumnName = "solicitud_folio", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evaluaciones evaluaciones;

    public EvaluacionLijado() {
    }

    public EvaluacionLijado(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public EvaluacionLijado(Integer evalucionesSolicitudFolio, boolean superficieLijada, String comentarioSuperficieLijada, boolean imperfeccionLijada, String comentarioImperfeccionLijada) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
        this.superficieLijada = superficieLijada;
        this.comentarioSuperficieLijada = comentarioSuperficieLijada;
        this.imperfeccionLijada = imperfeccionLijada;
        this.comentarioImperfeccionLijada = comentarioImperfeccionLijada;
    }

    public Integer getEvalucionesSolicitudFolio() {
        return evalucionesSolicitudFolio;
    }

    public void setEvalucionesSolicitudFolio(Integer evalucionesSolicitudFolio) {
        this.evalucionesSolicitudFolio = evalucionesSolicitudFolio;
    }

    public boolean getSuperficieLijada() {
        return superficieLijada;
    }

    public void setSuperficieLijada(boolean superficieLijada) {
        this.superficieLijada = superficieLijada;
    }

    public String getComentarioSuperficieLijada() {
        return comentarioSuperficieLijada;
    }

    public void setComentarioSuperficieLijada(String comentarioSuperficieLijada) {
        this.comentarioSuperficieLijada = comentarioSuperficieLijada;
    }

    public boolean getImperfeccionLijada() {
        return imperfeccionLijada;
    }

    public void setImperfeccionLijada(boolean imperfeccionLijada) {
        this.imperfeccionLijada = imperfeccionLijada;
    }

    public String getComentarioImperfeccionLijada() {
        return comentarioImperfeccionLijada;
    }

    public void setComentarioImperfeccionLijada(String comentarioImperfeccionLijada) {
        this.comentarioImperfeccionLijada = comentarioImperfeccionLijada;
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
        if (!(object instanceof EvaluacionLijado)) {
            return false;
        }
        EvaluacionLijado other = (EvaluacionLijado) object;
        if ((this.evalucionesSolicitudFolio == null && other.evalucionesSolicitudFolio != null) || (this.evalucionesSolicitudFolio != null && !this.evalucionesSolicitudFolio.equals(other.evalucionesSolicitudFolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.EvaluacionLijado[ evalucionesSolicitudFolio=" + evalucionesSolicitudFolio + " ]";
    }
    
}
