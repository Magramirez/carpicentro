/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "solicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findByFolio", query = "SELECT s FROM Solicitud s WHERE s.folio = :folio")
    , @NamedQuery(name = "Solicitud.findByFecha", query = "SELECT s FROM Solicitud s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "Solicitud.findByFechaEntrega", query = "SELECT s FROM Solicitud s WHERE s.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Solicitud.findByNumeroPlano", query = "SELECT s FROM Solicitud s WHERE s.numeroPlano = :numeroPlano")
    , @NamedQuery(name = "Solicitud.findByEstado", query = "SELECT s FROM Solicitud s WHERE s.estado = :estado")
    , @NamedQuery(name = "Solicitud.findByColor", query = "SELECT s FROM Solicitud s WHERE s.color = :color")
    , @NamedQuery(name = "Solicitud.findByMedida", query = "SELECT s FROM Solicitud s WHERE s.medida = :medida")
    , @NamedQuery(name = "Solicitud.findByTipoMadera", query = "SELECT s FROM Solicitud s WHERE s.tipoMadera = :tipoMadera")
    , @NamedQuery(name = "Solicitud.findByAcabado", query = "SELECT s FROM Solicitud s WHERE s.acabado = :acabado")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "folio")
    private Integer folio;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "fechaEntrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @Column(name = "numeroPlano")
    private int numeroPlano;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "medida")
    private String medida;
    @Basic(optional = false)
    @Column(name = "tipoMadera")
    private String tipoMadera;
    @Basic(optional = false)
    @Column(name = "acabado")
    private String acabado;
    @JoinColumn(name = "cliente_numeroCliente", referencedColumnName = "numeroCliente")
    @ManyToOne(optional = false)
    private Cliente clientenumeroCliente;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitud")
    private Evaluaciones evaluaciones;

    public Solicitud() {
    }

    public Solicitud(Integer folio) {
        this.folio = folio;
    }

    public Solicitud(Integer folio, Date fecha, Date fechaEntrega, int numeroPlano, String estado, String color, String medida, String tipoMadera, String acabado) {
        this.folio = folio;
        this.fecha = fecha;
        this.fechaEntrega = fechaEntrega;
        this.numeroPlano = numeroPlano;
        this.estado = estado;
        this.color = color;
        this.medida = medida;
        this.tipoMadera = tipoMadera;
        this.acabado = acabado;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumeroPlano() {
        return numeroPlano;
    }

    public void setNumeroPlano(int numeroPlano) {
        this.numeroPlano = numeroPlano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    public Cliente getClientenumeroCliente() {
        return clientenumeroCliente;
    }

    public void setClientenumeroCliente(Cliente clientenumeroCliente) {
        this.clientenumeroCliente = clientenumeroCliente;
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
        hash += (folio != null ? folio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.Solicitud[ folio=" + folio + " ]";
    }
    
}
