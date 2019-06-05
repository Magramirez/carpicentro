/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.enlacesoftware.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByNumeroCliente", query = "SELECT c FROM Cliente c WHERE c.numeroCliente = :numeroCliente")
    , @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente")
    , @NamedQuery(name = "Cliente.findByApellidoPaternoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoPaternoCliente = :apellidoPaternoCliente")
    , @NamedQuery(name = "Cliente.findByApellidoMaternoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoMaternoCliente = :apellidoMaternoCliente")
    , @NamedQuery(name = "Cliente.findByTelefonoCliente", query = "SELECT c FROM Cliente c WHERE c.telefonoCliente = :telefonoCliente")
    , @NamedQuery(name = "Cliente.findByCorreoElectronico", query = "SELECT c FROM Cliente c WHERE c.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Cliente.findByCelularCliente", query = "SELECT c FROM Cliente c WHERE c.celularCliente = :celularCliente")
    , @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Cliente.findByRfc", query = "SELECT c FROM Cliente c WHERE c.rfc = :rfc")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numeroCliente")
    private Integer numeroCliente;
    @Basic(optional = false)
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Basic(optional = false)
    @Column(name = "apellidoPaternoCliente")
    private String apellidoPaternoCliente;
    @Basic(optional = false)
    @Column(name = "apellidoMaternoCliente")
    private String apellidoMaternoCliente;
    @Basic(optional = false)
    @Column(name = "telefonoCliente")
    private int telefonoCliente;
    @Basic(optional = false)
    @Column(name = "correoElectronico")
    private String correoElectronico;
    @Basic(optional = false)
    @Column(name = "celularCliente")
    private int celularCliente;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "rfc")
    private String rfc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientenumeroCliente")
    private List<Solicitud> solicitudList;

    public Cliente() {
    }

    public Cliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente(Integer numeroCliente, String nombreCliente, String apellidoPaternoCliente, String apellidoMaternoCliente, int telefonoCliente, String correoElectronico, int celularCliente, String direccion, String rfc) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoPaternoCliente = apellidoPaternoCliente;
        this.apellidoMaternoCliente = apellidoMaternoCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoElectronico = correoElectronico;
        this.celularCliente = celularCliente;
        this.direccion = direccion;
        this.rfc = rfc;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPaternoCliente() {
        return apellidoPaternoCliente;
    }

    public void setApellidoPaternoCliente(String apellidoPaternoCliente) {
        this.apellidoPaternoCliente = apellidoPaternoCliente;
    }

    public String getApellidoMaternoCliente() {
        return apellidoMaternoCliente;
    }

    public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
        this.apellidoMaternoCliente = apellidoMaternoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(int celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @XmlTransient
    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCliente != null ? numeroCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.numeroCliente == null && other.numeroCliente != null) || (this.numeroCliente != null && !this.numeroCliente.equals(other.numeroCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.enlacesoftware.entity.Cliente[ numeroCliente=" + numeroCliente + " ]";
    }
    
}
