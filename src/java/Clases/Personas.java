/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "personas")
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByIDcarnet", query = "SELECT p FROM Personas p WHERE p.iDcarnet = :iDcarnet"),
    @NamedQuery(name = "Personas.findByCedula", query = "SELECT p FROM Personas p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Personas.findByPrimerNombre", query = "SELECT p FROM Personas p WHERE p.primerNombre = :primerNombre"),
    @NamedQuery(name = "Personas.findBySegundoNombre", query = "SELECT p FROM Personas p WHERE p.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Personas.findByPrimerApellido", query = "SELECT p FROM Personas p WHERE p.primerApellido = :primerApellido"),
    @NamedQuery(name = "Personas.findBySegundoApellido", query = "SELECT p FROM Personas p WHERE p.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Personas.findByEMail", query = "SELECT p FROM Personas p WHERE p.eMail = :eMail"),
    @NamedQuery(name = "Personas.findByTelefono", query = "SELECT p FROM Personas p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Personas.findByActivo", query = "SELECT p FROM Personas p WHERE p.activo = :activo")})
public class Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDcarnet")
    private Integer iDcarnet;
    @Basic(optional = false)
    @Column(name = "Cedula")
    private int cedula;
    @Basic(optional = false)
    @Column(name = "PrimerNombre")
    private String primerNombre;
    @Column(name = "SegundoNombre")
    private String segundoNombre;
    @Basic(optional = false)
    @Column(name = "PrimerApellido")
    private String primerApellido;
    @Basic(optional = false)
    @Column(name = "SegundoApellido")
    private String segundoApellido;
    @Basic(optional = false)
    @Column(name = "e-mail")
    private String eMail;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public Personas() {
    }

    public Personas(Integer iDcarnet) {
        this.iDcarnet = iDcarnet;
    }

    public Personas(Integer iDcarnet, int cedula, String primerNombre, String primerApellido, String segundoApellido, String eMail, String telefono, boolean activo) {
        this.iDcarnet = iDcarnet;
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.eMail = eMail;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Integer getIDcarnet() {
        return iDcarnet;
    }

    public void setIDcarnet(Integer iDcarnet) {
        this.iDcarnet = iDcarnet;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDcarnet != null ? iDcarnet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.iDcarnet == null && other.iDcarnet != null) || (this.iDcarnet != null && !this.iDcarnet.equals(other.iDcarnet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Personas[ iDcarnet=" + iDcarnet + " ]";
    }
    
}
