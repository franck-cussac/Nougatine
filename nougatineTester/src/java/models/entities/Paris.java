/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kuungfu-sheep
 */
@Entity
@Table(name = "paris")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paris.findAll", query = "SELECT p FROM Paris p"),
    @NamedQuery(name = "Paris.findById", query = "SELECT p FROM Paris p WHERE p.id = :id"),
    @NamedQuery(name = "Paris.findByJeux", query = "SELECT p FROM Paris p WHERE p.jeux = :jeux"),
    @NamedQuery(name = "Paris.findByMontant", query = "SELECT p FROM Paris p WHERE p.montant = :montant")})
public class Paris implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "jeux")
    private String jeux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "montant")
    private String montant;
    @JoinColumn(name = "id_match", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Match idMatch;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users idUser;

    public Paris() {
    }

    public Paris(Integer id) {
        this.id = id;
    }

    public Paris(Integer id, String jeux, String montant) {
        this.id = id;
        this.jeux = jeux;
        this.montant = montant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJeux() {
        return jeux;
    }

    public void setJeux(String jeux) {
        this.jeux = jeux;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Match getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Match idMatch) {
        this.idMatch = idMatch;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paris)) {
            return false;
        }
        Paris other = (Paris) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.entities.Paris[ id=" + id + " ]";
    }
    
}
